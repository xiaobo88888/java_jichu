package duoxiancheng.tongbu;

public class maipiao4 implements Runnable{
//    private int tickets = 100;
    private static int tickets = 100; //静态方法只能访问静态变量，非静态方法都可以访问
    private Object obj = new Object();
    private int x = 100;

    @Override
    public void run() {
        while (true) {
            if(x % 2 == 0) {
//                synchronized (obj) {
//                synchronized (this) {
                synchronized (maipiao4.class) {//所以这里不能用this，因为this指代对象的，得用类的字节码
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "窗口正在出售第" + tickets + "张票");
                        tickets--;
                    }
                }
            }else{
                sellPiao();
            }
            x--;
        }
    }

    private static synchronized void sellPiao() {//静态方法属于类的，所以这里使用类锁上的
        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "窗口正在出售第" + tickets + "张票");
            tickets--;
        }
    }


}
