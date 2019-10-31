package syn;

import tools.SleepTools;

public class TestSynObject {
    public static void main(String[] args) {
        SynClzAndInst synClzAndInst = new SynClzAndInst();

        SynObject synObject = new SynObject(synClzAndInst);
        Thread thread1 = new Thread(synObject);

        //因为锁的是同一个对象，所以线程不能同时运行,必须等一个线程执行完了释放对象，下一个线程才能运行
        SynObject2 synObject2 = new SynObject2(synClzAndInst);
        Thread thread2 = new Thread(synObject2);

        thread1.start();
        thread2.start();

        SleepTools.second(1);
    }


//    public static void main(String[] args) {
//        SynClzAndInst synClzAndInst = new SynClzAndInst();
//        SynClzAndInst synClzAndInst2 = new SynClzAndInst();
//
//        SynObject synObject = new SynObject(synClzAndInst);
//        Thread thread1 = new Thread(synObject);
//
//        //因为锁的不是同一个对象，所以线程能同时运行,必须等一个线程执行完了释放对象，下一个线程才能运行
//        SynObject2 synObject2 = new SynObject2(synClzAndInst2);
//        Thread thread2 = new Thread(synObject2);
//
//        thread1.start();
//        thread2.start();
//
//        SleepTools.second(1);
//    }
}
