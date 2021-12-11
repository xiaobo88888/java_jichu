package duoxiancheng.tongbu;

/*
        在maipiao类中重写run方法，实现卖票，步骤如下：
                判断票数，如果>0就卖票，并告知是在哪个窗口卖的
                卖了票之后，总票数要减一
                用死循环让卖票一直执行


        使用sleep方法后出现了两个问题：

                相同的票出现了多次
                还出现了负数的票
 */
public class maipiao implements Runnable{
    private int tickets = 100;

    @Override
    public void run() {

        //问题1：相同的票出现了多次

        /*while(true){
            //假设tickets = 100
            //t1, t2, t3
            //假设t1线程抢到了CPU的执行权
            if(tickets > 0){
                //通过sleep方法模拟卖票时间

                try {
                    Thread.sleep(100);
                    //t1线程休息了100毫秒
                    //假设t2线程抢到了CPU执行权,t2开始执行，到这里也休息了100毫秒
                    //假设这时候t3抢到了CPU的执行权，t3开始执行，到这里也休息了100毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //假设这个时候t1抢到了CPU执行权，t1在窗口输出"一号窗口正在出售第100张票"
                System.out.println(Thread.currentThread().getName() + "窗口正在出售第" + tickets + "张票");
                //这个时候本来应该--，但t2抢到了CPU的执行权，t2在窗口输出"二号窗口正在出售第100张票"
                //然后这个时候也没有--，而是t3抢到了CPU的执行权，t3在窗口输出"三号窗口正在出售第100张票
                tickets--;
                //然后三个线程执行--，tickets变成了97
            }
        }*/


        //问题2：还出现了负数的票

        while(true){
            //假设tickets = 1
            //t1, t2, t3
            //假设t1线程抢到了CPU的执行权
            if(tickets > 0){
                //通过sleep方法模拟卖票时间

                try {
                    Thread.sleep(100);
                    //t1线程休息了100毫秒
                    //假设t2线程抢到了CPU执行权,t2开始执行，到这里也休息了100毫秒
                    //假设这时候t3抢到了CPU的执行权，t3开始执行，到这里也休息了100毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "窗口正在出售第" + tickets + "张票");
                tickets--;
                //假设这个时候t1抢到了CPU的执行权，在控制台输出"窗口一正在出售第1张票"
                //tickets--，tickets变成0
                //这个时候t2抢到了CPU的执行权，在控制台输出"窗口二正在出售第0张票"
                //tickets--，tickets变成-1
                //这个时候t3抢到了CPU的执行权，在控制台输出"窗口三正在出售第-1张票"
                //tickets--,tickets变成-2
                //然后这个循环结束，进入下一次循环判断tickets<0，就不进入这里了
            }
        }
    }
}
