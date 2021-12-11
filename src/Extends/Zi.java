package Extends;

/*super和this
* 调用属性 this.   super.
* 调用构造方法 this()   super()
* 调用方法  this.   super.   */


/*变量
* 变量的访问优先级：方法中局部变量 > 本类中变量> 父类中变量
* 这里只考虑父类中的变量，不会考虑父类的父类（只考虑一个父类）*/


/*构造方法
* 子类中所有构造方法会默认调用父类无参构造方法，每个子类构造方法默认第一条语句为super();
* 如果父类中没有无参构造方法，就会报错，这时候可以在父类中增加无参构造方法，或者在子类构造
* 方法中显式的调用带参构造方法*/


/*方法
* 调用方法，先查找子类中的方法，再查找父类中的方法，不会查找父类的父类（只查找一个父类）*/

public class Zi extends Fu{
    public int age = 20;

    //变量
    public void show(){
        int age = 15;
        //本类中，父类定义了个age，子类也定义了的age，方法还定义了局部变量age
        System.out.println(age);//最终输出局部变量age

        System.out.println(this.age);//输出本类变量age

        System.out.println(super.age);//输出父类变量age
    }

    //构造方法
    public Zi(){
//        super();//调用父类无参构造方法
//        super(20);//显式调用父类有参构造方法
        System.out.println("子，无参");
    }
    public Zi(int age){
//        super();//调用父类无参构造方法
//        super(20);//显式调用父类有参构造方法
        System.out.println("子，带参");
    }

    //方法
    public void erzi(){
        super.fuqin();//先调用父类的方法
        System.out.println("子，erzi");
    }
}
