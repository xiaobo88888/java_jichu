package API_changyong;

/*System
* 在java.lang包下，所以不要导包
* 也是用final修饰，没有子类
* 没有构造方法，不能创建对象，但方法用static修饰，可以用类名调用*/
public class system {
    public static void main(String[] args) {
//        public static void exit(int status)  终止java虚拟机，非零表示终止异常，类似于C的exit(0)
       /* System.out.println("开始");
        System.exit(0);
        System.out.println("结束");*/

//        public static long currentTimeMillis()  返回当前时间，已毫秒为单位
        //返回的是从1970年1月1日距今的时间
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");

        //可以测试以下运行时间
        long a = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            System.out.println(i);
        }
        long b = System.currentTimeMillis();
        System.out.println("共耗时" + (b - a) + "毫秒");
    }
}
