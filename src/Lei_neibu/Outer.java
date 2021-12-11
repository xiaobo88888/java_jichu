package Lei_neibu;

import org.w3c.dom.ls.LSOutput;

/*内部类定义格式：
*        public class 外部类名{
*               修饰符 class 内部类名{
*               }
*        }
* 内部类访问特点：
*            内部类可以直接访问外部类的成员，包括私有
*                ——》因为private修饰符是本类中可以使用，而内部类也属于外部类中
*            外部类访问内部类的成员需要创建对象
*
* 内部类分为：成员内部类——》内部类做外部类的成员——》间接调用成员内部类的成员
*           局部内部类——》内部类做外部类方法中的内部类——》间接调用成员内部类的成员
* */
public class Outer {
    private int num = 10;

    public void A(){
        System.out.println("哈哈哈哈");
    }
    public void getinter(){
//        System.out.println(name);//外部类无法直接访问内部类成员，需要创建内部类对象
        inter i = new inter();
        System.out.println(i.name);//外部类需要创建内部类对象来访问内部类成员
   }
   public void method() {
       inter i = new inter();
       i.B();//外部类需要创建内部类对象来访问内部类成员
   }

   //内部类
    public class inter{
        public String name = "小刘";

        public void get(){
            System.out.println(num);//内部类可以直接访问外部类成员，包括私有
        }
        public void gets(){
            A();//内部类可以直接访问外部类成员，包括私有
        }
        public void B(){
            System.out.println("嘿嘿嘿");
        }
    }
}
