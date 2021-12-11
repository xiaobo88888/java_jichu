package duoxiancheng.shixian;

/*
    Thread类中获取和设置线程名称的方法：
            void setName(String name);将此线程的名称更改为参数name
            String getName();返回此线程的名称

            还可以通过带参的构造方法来设置线程名称，但是继承Thread的类中要显示定义无参和带参构造方法
            且带参构造方法调用的是父类的构造方法
            public Thread(String name) 分配新的 Thread 对象。
 */
public class shezhi_huoqu_mingcheng {
    public static void main(String[] args) {
       /* MyThread mt = new MyThread();
        MyThread mt2 = new MyThread();

        //void setName(String name);将此线程的名称更改为参数name
        mt.setName("刘博");
        mt2.setName("煤球");*/

        /*MyThread mt = new MyThread("刘博");
        MyThread mt2 = new MyThread("煤球");

        mt.start();
        mt2.start();*/


        //public static Thread currentThread() 返回对当前正在执行的线程对象的引用。
        //System.out.println(getName());
        System.out.println(Thread.currentThread().getName());//获取main方法中的线程名称
        //返回main，说明main()是在一个叫main的线程中执行的
    }
}
