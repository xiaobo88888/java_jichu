package duoxiancheng.shixian;

/*
    1.public static void sleep(long millis)
        在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），此操作受到系统计时器和调度程序精度和准确性的影响
    2.public final void join()
        等待该线程终止
    3.public final void setDaemon(boolean on)
        将该线程标记为守护线程或用户线程。当正在运行的线程都是守护线程时，Java 虚拟机退出。
        该方法必须在启动线程前调用。
        主线程结束后，守护线程不会立刻结束，还会"挣扎一会"

        main线程不能设置成守护线程

 */
public class xiancheng_kongzhi {
    public static void main(String[] args) {
        MyThread_kongzhi mk1 = new MyThread_kongzhi();
        MyThread_kongzhi mk2 = new MyThread_kongzhi();
        MyThread_kongzhi mk3 = new MyThread_kongzhi();

        mk1.setName("刘博");

        mk2.setName("煤球");
        mk3.setName("高辉");

        //3.public final void setDaemon(boolean on)
        //        将该线程标记为守护线程或用户线程。当正在运行的线程都是守护线程时，Java 虚拟机退出。
        //        该方法必须在启动线程前调用。
        Thread.currentThread().setName("超人");
        mk1.setDaemon(true);
        mk2.setDaemon(true);
        mk3.setDaemon(true);

        mk1.start();

        //2.public final void join()
        //        等待该线程终止
        //join() 使用这个方法得在指定的线程执行之后，且在其他线程执行之前
//        try {
//            mk1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        mk2.start();
        mk3.start();


        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }

    }
}
