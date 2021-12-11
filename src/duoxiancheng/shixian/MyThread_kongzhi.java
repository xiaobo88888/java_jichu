package duoxiancheng.shixian;

public class MyThread_kongzhi extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            //1.public static void sleep(long millis)
            //        在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），此操作受到系统计时器和调度程序精度和准确性的影响
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            System.out.println(getName() + ":" + i);
        }
    }
}
