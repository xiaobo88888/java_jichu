package hanshushi_interface;

public class Demo {
    public static void main(String[] args) {
        Demo_ d = () -> System.out.println("函数式接口");
        d.show();
        //Lambda表达式可以通过局部变量的赋值来判断对应的接口
    }
}
