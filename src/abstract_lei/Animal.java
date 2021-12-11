package abstract_lei;

/*
* 没有方法体的方法，叫抽象方法，而有抽象方法的类叫抽象类
* 抽象方法必须要在抽象类中声明*/

/*特点
* 1.抽象类和抽象方法要用abstract声明
* 2.抽象类中不一定要有抽象方法，但有抽象方法的类一定是抽象类
* 3.抽象类不能直接实例化，只能采用多态的方法，通过子类对象实例化——抽象类多态
* 4.抽象类的子类要么重写抽象类中的抽象方法，要么本身就是一个抽象类*/

/*抽象类的成员特点
* 1.抽象类中可以有常量，也可以有变量
* 2.抽象类中可以有带参和无参构造方法，但是抽象类本身不能实例化，所以抽象类中构造方法的作用是通过子类来
*   给父类成员初始化
* 3.抽象类中可以有抽象方法，也可以有非抽象方法*/

public abstract class Animal {//抽象类
    private int age = 1;//变量
    private final String name = "喵喵";//常量

    public Animal(){}//无参构造方法
    public Animal(int age){//带参构造方法
        this.age = age;//通过子类来使用父类构造器
    }

    public abstract void eat();//抽象方法

    //抽象类中可以有具体方法
    public void sleep(){//具体方法
        System.out.println("睡觉");
    }
    public void show(){
        System.out.println("年龄:" + age);
        System.out.println("姓名:" + name);
    }
}
