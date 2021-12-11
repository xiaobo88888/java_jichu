package Lei_neibu;

/*局部内部类是不需要加修饰符的，而且它是无法被外界直接访问的，需要在外部类的方法中创建内部类的对象*/

public class Outer_jubu {
    private int num = 1;

    public void method(){
        int num2 = 2;

        class Inter_jubu{
            public void show(){
                System.out.println(num);//局部内部类可以直接访问外部类成员
                System.out.println(num2);//局部内部类还可以访问方法内的局部变量
            }
        }
        Inter_jubu i = new Inter_jubu();
        i.show();//这里需要在方法中创建内部类对象间接调用
    }
}
