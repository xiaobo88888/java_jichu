package jihe.fanxing;

public class fanxing_fangfa_Demo {
    public static void main(String[] args) {
        //普通方法
//        fanxing_fangfa f = new fanxing_fangfa();
//        System.out.println(f.show("刘博"));
//        System.out.println(f.show(100));
//        System.out.println(f.show(true));
//        System.out.println(f.show(12.45));//这里没有定义double的，所以就报错了，这样局限大

        //泛型类
//        fanxing_fangfa<String> f1 = new fanxing_fangfa<String>();
//        System.out.println(f1.show("刘博"));
//        fanxing_fangfa<Integer> f2 = new fanxing_fangfa<Integer>();
//        System.out.println(f2.show(100));
//        fanxing_fangfa<Boolean> f3 = new fanxing_fangfa<Boolean>();
//        System.out.println(f3.show(true));
//        fanxing_fangfa<Double> f4 = new fanxing_fangfa<Double>();
//        System.out.println(f4.show(12.34));

        //泛型方法
        fanxing_fangfa f = new fanxing_fangfa();
        System.out.println(f.show("刘博"));
        System.out.println(f.show(100));
        System.out.println(f.show(true));
        System.out.println(f.show(12.34));

    }
}
