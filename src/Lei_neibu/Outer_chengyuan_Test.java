package Lei_neibu;

/*创建内部类对象：
*    外部类名.内部类名 对象名 = 外部类对象.内部类对象
*    例：Outer.Inter oi = new Outer().new Inter();
* 但我们一般不这么做，因为定义内部类本来就是禁止外界直接访问，所以我们一般采用外部类中定义方法来访问
* 内部类成员，然后在外界定义外部类对象，调用外部类方法来间接访问内部类的成员
* */
public class Outer_chengyuan_Test {
    public static void main(String[] args) {
        //    inter_chengyuan i = new inter_chengyuan();
        //因为内部类inter_chengyuan是定义在类Outer_chengyuan中的，所以无法直接创建内部类对象
        //多层创建内部类对象
//        Outer_chengyuan.inter_chengyuan oi = new Outer_chengyuan().new inter_chengyuan();
//        oi.show();
        //而当内部类用private修饰时，就不能直接在外部访问了
        //所以这里要间接访问
        Outer_chengyuan o = new Outer_chengyuan();
        o.method();
    }
}
