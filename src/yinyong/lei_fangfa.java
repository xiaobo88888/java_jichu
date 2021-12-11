package yinyong;


/*
    定义了一个接口，接口中有一个静态方法int covert(String s);
 */
public class lei_fangfa {
    public static void main(String[] args) {
        //Lambda表达式
        usecovert((String s) -> {
            return Integer.parseInt(s);
        });

        //Lambda表达式省略
        usecovert(s -> Integer.parseInt(s));

        //引用类方法
        usecovert(Integer::parseInt);//这里s作为参数传递给了parseInt方法
        //Lambda表达式被类方法替代时，它的形式参数全部传递给静态方法作为参数
    }
    private static void usecovert(lei_fangfa_ l){
        int num = l.conert("888");
        System.out.println(num);
    }
}
