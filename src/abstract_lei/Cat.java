package abstract_lei;

public class Cat extends Animal{
    //重写抽象类中的抽象方法
    public Cat(){}
    public Cat(int age){
        super(age);//访问父类构造器，给父类属性赋值
    }
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
