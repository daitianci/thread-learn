package interrupt;

import interrupt.UserThread;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        UserThread userThread = new UserThread();
        userThread.start();
        //主线程休眠两秒
        Thread.sleep(200);

        //中断子线程，假如子线程处于休眠状态，则会抛出InterruptedException异常
        userThread.interrupt();
    }
}
