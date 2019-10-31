package syn;

import tools.SleepTools;

/**
 * 类锁
 * 1、synchronize关键字加在静态方法上
 * 2、synchronize代码块，里面修饰xxx.class
 */
public class SynClass extends Thread {
    @Override
    public void run() {
        System.out.println("TestClass is running...");
        hello();
    }

    //类锁，实际是锁类的class对象
    private static synchronized void hello(){
        SleepTools.second(1);
        System.out.println("synClass going...");
        SleepTools.second(1);
        System.out.println("synClass end");
    }
}
