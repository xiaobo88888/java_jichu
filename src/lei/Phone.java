package lei;

/*
* 成员变量是存储在堆内存的，局部变量是存储在栈内存的
* 成员变量是有默认值的，局部变量没有默认值*/
public class Phone {
    //成员变量
    String brand;
    float price;

    public void call(){
        System.out.println("打电话");
    }
    public void duanxin(){
        int i = 1;//局部变量
        System.out.println("发短信");
    }
}
