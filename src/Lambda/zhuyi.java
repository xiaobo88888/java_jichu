package Lambda;

public class zhuyi {
    public static void main(String[] args) {
        //注意一：接口中仅能有一个抽象方法
        usexuexi(() -> System.out.println("好好学习"));

        //注意二：使用Lambda必须有上下文环境，才能推导出Lambda接口

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        }).start();

        /*() -> System.out.println("Lambda表达式")
            可以代表new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        }*/

        //所以可以把他赋值给一个接口
        //通过局部变量的类型来推到Lambda表达式的接口
        Runnable r = () -> System.out.println("Lambda表达式");
        new Thread(r).start();

        //通过构造方法的参数来推断Lambda表达式对应的接口
        new Thread(() -> System.out.println("Lambda表达式")).start();

    }
    private static void usexuexi(xuexi i){
        i.xuexi();
    }
}
