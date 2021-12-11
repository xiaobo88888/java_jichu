package duoxiancheng.tongbu;

/*
    void lock()获取锁。
    void unlock()释放锁。
 */
public class Lock_suo {
    public static void main(String[] args) {
        maipiao5 mp = new maipiao5();

        Thread t1 = new Thread(mp, "一号");
        Thread t2 = new Thread(mp, "二号");
        Thread t3 = new Thread(mp,"三号");

        t1.start();
        t2.start();
        t3.start();
    }
}
