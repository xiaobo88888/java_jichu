package jihe.fanxing;

public class fanxing_jiekou_Demo {
    public static void main(String[] args) {
        fanxing_jiekou_interface<String> f = new fanxing_jiekou<String>();
        System.out.println(f.show("刘博"));

        fanxing_jiekou_interface<Integer> f2 = new fanxing_jiekou<Integer>();
        System.out.println(f2.show(100));

        fanxing_jiekou_interface<Boolean> f3 = new fanxing_jiekou<Boolean>();
        System.out.println(f3.show(true));
    }
}
