package yinyong;

import java.util.Locale;

/*
    定义了一个类，类里面有public void printUpper(String s);
    定义一个接口，里面有一个抽象方法，void printUpper(String s);
 */
public class shili_fangfa_Demo {
    public static void main(String[] args) {
        //Lambda表达式
        useprint((String s) -> {
            System.out.println(s.toUpperCase());
        });

        //Lambda表达式的省略
        useprint(s -> System.out.println(s.toUpperCase()));


        //而Lambda表达式所作的操作，我已经定义了一个类，类里面的方法已经完成了
        //引用对象的实例方法
        shili_fangfa sf = new shili_fangfa();
        useprint(sf::printUpper);//s被传递给printUpper作为参数了
        //Lambda表达式被对象的实例方法替代后，Lambda表达式的形式参数全部传递给该方法作为参数

        //所以这里还可以继续简化
        useprint(new shili_fangfa()::printUpper);
        //通过new shili_fangfa()得到shili_fangfa的对象，然后通过对象引用成员方法printUpper
    }

    private static void useprint(shili_fangfa_ s){
        s.printUpper("hello, world");
    }
}
