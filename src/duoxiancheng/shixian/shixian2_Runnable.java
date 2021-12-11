package duoxiancheng.shixian;

/*
    public Thread(Runnable target)
        分配新的 Thread 对象

    public Thread(Runnable target,String name)
        分配新的 Thread 对象，且用name给线程命名



    通过实现Runnable接口来实现多线程的好处：
        该类可以有自己的父类
 */
public class shixian2_Runnable {
    public static void main(String[] args) {
        //先创建MyThread_Runnable类的对象
        MyThread_Runnable mr = new MyThread_Runnable();

        //再创建Thread类的对象
        //public Thread(Runnable target)分配新的 Thread 对象
//        Thread t = new Thread(mr);//因为这里要的是Runnable类的对象，而自定义的MyThread_Runnable类实现了Runnable接口
//        Thread t2 = new Thread(mr);


        //public Thread(Runnable target,String name)
        //      分配新的 Thread 对象，且用name给线程命名
        Thread t = new Thread(mr, "高铁");
        Thread t2 = new Thread(mr, "汽车");

        //可以把MyThread_Runnable类的对象看作是一种资源，然后多个线程t,t2去使用

        t.start();
        t2.start();

    }
}
