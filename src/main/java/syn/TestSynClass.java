package syn;

public class TestSynClass {
    public static void main(String[] args) {
        //1、测试对象锁
        SynClass synClass = new SynClass();
        synClass.start();

        //因为是类锁，所以必须等synClass运行完毕以后才会运行第二个
        SynClass synClass2 = new SynClass();
        synClass2.start();
    }
}
