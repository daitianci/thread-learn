package syn;

/**
 * 对象锁
 * 1、synchronized修饰普通方法
 * 2、synchronized(this)修饰代码块
 */
public class SynObject implements Runnable {
    private SynClzAndInst synClzAndInst;

    public SynObject(SynClzAndInst synClzAndInst) {
        this.synClzAndInst = synClzAndInst;
    }

    public void run() {
        System.out.println("TestInstance is running..."+synClzAndInst);
        synClzAndInst.instance();
    }
}
