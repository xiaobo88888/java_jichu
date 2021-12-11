package duoxiancheng.tongbu;

import java.lang.management.RuntimeMXBean;

public class maipiao3 implements Runnable {
    private int tickets = 100;
    private Object obj = new Object();
    private int x = 100;

    @Override
    public void run() {
        while (true) {
            if(x % 2 == 0) {
//                synchronized (obj) {
                synchronized (this) {//所以这里也得用this
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
//                synchronized (obj) {
//                    if (tickets > 0) {
//                        try {
//                            Thread.sleep(100);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(Thread.currentThread().getName() + "窗口正在出售第" + tickets + "张票");
//                        tickets--;
//                    }
//                }
                sellPiao();
            }
            x--;
        }
    }

    private synchronized void sellPiao() {//这里synchronized带的对象是本身this
//        synchronized (obj) {
        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "窗口正在出售第" + tickets + "张票");
            tickets--;
        }
//        }
    }

}
