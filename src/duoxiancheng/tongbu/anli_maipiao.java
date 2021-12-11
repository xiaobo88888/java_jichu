package duoxiancheng.tongbu;

/*
    需求：
        某电影院正在售票，总共有100张票，而它有三个窗口卖票，请设计一个程序模拟该电影院卖票

    思路：
        定义一个maipiao类实现Runnable接口，里面定义一个成员变量 private int tickets = 100;

        在maipiao类中重写run方法，实现卖票，步骤如下：
                判断票数，如果>0就卖票，并告知是在哪个窗口卖的
                卖了票之后，总票数要减一
                用死循环让卖票一直执行

        定义一个测试类anli_maipiao，里面有main方法，步骤如下：
                创建maipiao类的对象
                创建三个Thread类的对象，把maipiao类对象作为参数传递，并给出窗口名称(线程名称)
                启动线程
 */
public class anli_maipiao {
    public static void main(String[] args) {
        maipiao mp = new maipiao();

        Thread t1 = new Thread(mp, "一号");
        Thread t2 = new Thread(mp, "二号");
        Thread t3 = new Thread(mp,"三号");

        t1.start();
        t2.start();
        t3.start();
    }
}
