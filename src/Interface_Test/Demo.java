package Interface_Test;

/*接口
* 1.用关键字interface修饰   public interface 接口名{}
* 2.类实现接口用implements修饰  public class 类名 implements 接口名{}
* 3.接口实例化得参照多态的方式，通过实现类对象实例化——接口多态
* 4.接口的实现类：要么重写接口中所有抽象方法，要么是抽象类*/
public class Demo {
    public static void main(String[] args) {
//        jumpping a = new jumpping();
        //接口本身是抽象的，无法直接实例化

        jumpping j = new Cat();//可以用多态的方式实例化
        j.jump();
    }
}
