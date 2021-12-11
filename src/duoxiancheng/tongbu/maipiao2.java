package duoxiancheng.tongbu;

public class maipiao2 implements Runnable {
    private int tickets = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //synchronized (new Object())
            // 注意这里不能这样写，如果这样写，那么三个线程会创建三把锁，这样根本锁不住，只能创建一把锁

            //t1,t2,t3
            //假设t1先抢到了CPU的执行权
            //假设在t1休息的时候t2抢到了CPU的执行权，但这段代码已被锁上，t2只能等t1执行完
            synchronized (obj) {
                //t1进来后将这段代码锁上
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                        //t1休息100毫秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "窗口正在出售第" + tickets + "张票");
                    //t1醒来，在控制台输出"一号窗口正在出售第100张票"
                    tickets--;//然后tickets--,变成99
                }
            }
            //t1出来了，这段代码的锁就被释放了
        }
    }
}
