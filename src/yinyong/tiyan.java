package yinyong;

/*
    定义一个接口tiyan_，接口中有个方法叫void printString(String s);
 */
public class tiyan {
    public static void main(String[] args) {
        useprint( s -> System.out.println(s));
        //这里s的类型之所以能省略，是因为调用useprint方法需要的是接口tiyan_的对象，而接口中
        //有个抽象方法void printString(String a)，该方法形参类型是String，所以可以推导出这里的s的类型是String


        System.out.println("感觉听不懂");//而Lambda表达式所做的操作，其实就相当于这句语句
        //System.out返回一个标准输出流对象，然后通过这个输出流对象调用println方法，将字符串输出

        //方法引用符::
        useprint(System.out::println);//直接将参数传递给了println方法
        //可推导的就是可省略的——println需要的参数类型是推导出来的
    }
    private static void useprint(tiyan_ t){
        t.printString("感觉听不懂");
    }
}
