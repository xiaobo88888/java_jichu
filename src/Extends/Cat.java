package Extends;

/*
 * 因为测试中调用了有参构造函数，而子类不能隐式访问父类有参构造函数，且属性父类中也是
 * private修饰，所以要显式调用super，再把形参传过去，为属性赋值*/

public class Cat extends Animal{
    public Cat(){}
    public Cat(String name, int age){
        super(name, age);
    }

    public void zhua(){
        System.out.println("抓老鼠");
    }
}
