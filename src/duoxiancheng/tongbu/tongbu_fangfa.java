package duoxiancheng.tongbu;

public class tongbu_fangfa {
    public static void main(String[] args) {
        maipiao3 mp = new maipiao3();

        Thread t1 = new Thread(mp, "一号");
        Thread t2 = new Thread(mp, "二号");
        Thread t3 = new Thread(mp,"三号");

        t1.start();
        t2.start();
        t3.start();
    }
}
