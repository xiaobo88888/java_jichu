package duoxiancheng.tongbu;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class maipiao5 implements Runnable{
    private int tickets = 100;
    private Object obj = new Object();
    private Lock lock = new ReentrantLock();


    //一般采用try-finally的方式，因为如果获取锁后后面的代码发生错误，锁也会被释放
    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();//获取锁
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "窗口正在出售第" + tickets + "张票");
                    tickets--;
                }
            } finally {
                lock.unlock();//释放锁
            }
        }
    }

    /*@Override
    public void run() {
        while (true) {
            lock.lock();//获取锁
            if (tickets > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "窗口正在出售第" + tickets + "张票");
                tickets--;
            }
            lock.unlock();//释放锁
        }
    }*/
}
