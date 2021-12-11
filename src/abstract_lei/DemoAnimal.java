package abstract_lei;

public class DemoAnimal {
    public static void main(String[] args) {
//        Animal a = new Animal();//抽象类不能实例化
        Animal a = new Cat();//通过子类创建对象——抽象类多态

        a.eat();
        a.sleep();
        a.show();

        Animal b = new Cat(5);
        b.eat();
        b.sleep();
        b.show();
    }
}
