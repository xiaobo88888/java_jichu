package API_changyong;

/*Math
* 在java.lang包下，所以可以不需要导包
* 且修饰符为fianl，所以是没有子类的
* 没有构造方法，但类中方法用static修饰，所以可以用类名调用
* */

public class math {
    public static void main(String[] args) {
//        public static int abs(int a)  返回参数的的绝对值
        System.out.println(Math.abs(9));
        System.out.println(Math.abs(-9));
        System.out.println("--------------");

//        public static double ceil(double a)  返回大于等于参数的最小double值，但这个值数值上是整数
        System.out.println(Math.ceil(11.11));
        System.out.println("--------------");

//        public static double floor(double a)  返回小于等于参数的最大double值，但这个值数值上是整数
        System.out.println(Math.floor(11.11));
        System.out.println("--------------");

//        public static int round (float a)   返回参数四舍五入的整数值
        System.out.println(Math.round(12.34));
        System.out.println(Math.round(15.67));
        System.out.println("--------------");

//        public static int max(int a, int b)  返回两个整数的最大值
        System.out.println(Math.max(4, 5));
        System.out.println("--------------");

//        public static int min(int a, int b)  返回两个整数的最小值
        System.out.println(Math.min(5, 6));
        System.out.println("--------------");

//        public static double pow(double a, double b)  返回a的b次幂的值
        System.out.println(Math.pow(3, 4));
        System.out.println("--------------");

//        public static double random()  返回值为double的正值，范围为[0.0, 1.0)
        System.out.println(Math.random());//范围为[0.0, 1.0)
        System.out.println(Math.random() * 10);//范围为[0.0, 10.0)
        System.out.println(Math.random() * 100 + 1);//范围为[1.0, 101.0)
        System.out.println((int)(Math.random() * 100));
        //加了个强转，范围为[0, 100)
    }
}
