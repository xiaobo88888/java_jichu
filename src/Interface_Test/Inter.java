package Interface_Test;

/*接口
* 1.属性
*      接口中属性只能是静态常量
*      所有属性默认带有static final
* 2.构造方法
*      接口中没有构造方法，因为接口主要是对行为抽象，是没有具体存在的
*      一个类如果没有父类，则默认继承Object类
* 3.方法
*      接口中的方法只能是抽象方法
*      默认带有pubic abstract*/
public interface Inter {
    //属性
    public int num = 10;
    public final int num2 = 20;

    public static final int num3 = 30; // == public int num3 = 30;
    //接口中的所有属性都被默认为即时是静态的，又是常量

    //方法
//    public Inter(){}
    // 接口中不能有构造方法，因为接口主要是对行为的抽象，是没有具体存在的

//    public void mothod(){}

    //接口中不能有非抽象方法
    public abstract void method();
    void get();//接口的方法默认带有public abstract
}
