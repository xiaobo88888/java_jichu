package yinyong;

/*
    定义了一个接口，接口中有一个抽象方法叫做void printint(int i);
 */
public class yinyong_fu {
    public static void main(String[] args) {
        //Lambda表达式
        useprint(i -> System.out.println(i));

        //方法引用符
        useprint(System.out::println);//i作为参数传递给了println
    }
    private static void useprint(yinyong_fu_ y){
        y.printint(888);
    }
}
