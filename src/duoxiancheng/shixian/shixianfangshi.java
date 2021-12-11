package duoxiancheng.shixian;

/*
    方式1：继承Thread类
        定义一个类MyThread继承Thread类
        在MyThread中重写run()方法
        创建MyThread类的对象
        启动线程
            public void start() 使该线程开始执行；Java 虚拟机调用该线程的 run 方法。

 */
public class shixianfangshi {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        MyThread mt2 = new MyThread();

//        mt.run();
//        mt.run();

        //public void start() 使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
        mt.start();
        mt2.start();
    }
}
