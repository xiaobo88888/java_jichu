package jihe.fanxing;

public class fanxing_lei_Demo{
    public static void main(String[] args) {
        fanxing_lei<String> f1 = new fanxing_lei<String>();
        f1.setT("刘博");
        System.out.println(f1.getT());

        fanxing_lei<Integer> f2 = new fanxing_lei<Integer>();
        f2.setT(100);
        System.out.println(f2.getT());

        fanxing_lei<Boolean> f3 = new fanxing_lei<Boolean>();
        f3.setT(true);
        System.out.println(f3.getT());
    }
}
