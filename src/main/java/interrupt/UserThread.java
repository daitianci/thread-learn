package interrupt;

public class UserThread extends Thread {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        while (!isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(threadName + " try to stop,but fail");

                //子线程处于休眠期时候interrupt会抛出InterruptedException，此时中断标志恢复成false，假如要中断则要在interrupt一次
                interrupt();

                e.printStackTrace();
            }
            System.out.println(threadName + " is running");
        }

        System.out.println(threadName + " is stop");
    }
}
