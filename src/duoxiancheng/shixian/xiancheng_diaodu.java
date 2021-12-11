package duoxiancheng.shixian;

/*
    线程调度:
        分时调度模型
        抢占式调度模型

    java使用抢占式调度模型

    Thread类中获取和设置线程优先级的方法：
            public final int getPriority();获取线程的优先级
            public finale void setPriority(int newPriority);设置线程优先级
                //IllegalArgumentException - 如果优先级不在 MIN_PRIORITY 到 MAX_PRIORITY 范围内。
                //SecurityException - 如果当前线程无法修改该线程。

    //线程优先级高仅仅代表获取CPU的使用几率高，并不是说线程优先级高的就一定先执行


         //static int MAX_PRIORITY = 10
         //          线程可以具有的最高优先级。
         //static int MIN_PRIORITY = 1
         //          线程可以具有的最低优先级。
         //static int NORM_PRIORITY = 5
         //          分配给线程的默认优先级。
 */
public class xiancheng_diaodu {
    public static void main(String[] args) {
        Thread_Priority tp1 = new Thread_Priority();
        Thread_Priority tp2 = new Thread_Priority();
        Thread_Priority tp3 = new Thread_Priority();

        tp1.setName("刘博");
        tp2.setName("高辉");
        tp3.setName("煤球");

        //public final int getPriority();获取线程的优先级
//        System.out.println(tp1.getPriority());//5
//        System.out.println(tp2.getPriority());//5
//        System.out.println(tp3.getPriority());//5
        //默认为5

        //public finale void setPriority(int newPriority);设置线程优先级
//        tp1.setPriority(10000);//IllegalArgumentException

        System.out.println(Thread.MIN_PRIORITY);//1
        System.out.println(Thread.MAX_PRIORITY);//10
        System.out.println(Thread.NORM_PRIORITY);//5

        tp1.setPriority(10);
        tp2.setPriority(1);
        tp3.setPriority(5);


        tp1.start();
        tp2.start();
        tp3.start();
    }
}
