package interface_New;

public class Demo2_static {
    public static void main(String[] args) {
        new_static ns = new new_static_demo();

        ns.show1();
        ns.show2();

//        ns.show3();
//        new_static_demo.show3();
        new_static.show3();//接口中定义的静态方法只能通过接口名调用
        //这个就和普通的类中定义的静态方法一样，只能通过类名调用
    }
}
