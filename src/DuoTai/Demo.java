package DuoTai;

/*多态：同一个对象，再不同时刻表现出不同的形态
*前提和体现：
*         1.有继承/实现关系(extends 父类/ implements接口)
*         2.有方法重写
*         3.有父类引用(接口)指向子类(实现)对象
* 访问成员特点：
*            1.访问成员属性，编译看左边（看父类是否定义了该属性），执行看左边（调用父类的属性）
*            2.访问成员方法，编译看左边（看父类是否定义了该方法），执行看右边（调用子类的该重写方法，如果没有重写方法则执行父类方法）
* 转型：
*     1.向上转型：
*              父类引用指向子类对象
*     2.向下转型：
*              父类引用转为子类对象（通过强转实现）*/
public class Demo {
    public static void main(String[] args) {
        Animal a = new Cat();
        System.out.println(a.age);
//        System.out.println(a.weight);

        a.eat();
//        a.play();

        Animal_opertor b = new Animal_opertor();
        Cat c = new Cat();
        b.opertor(c);

        Dog d = new Dog();
        b.opertor(d);

        //多态的转型
        //向上转型
        Animal cat = new Cat();
        cat.eat();
//        cat.play();//不能调用

        //向下转型
        Cat cat1 = (Cat)cat;
        cat1.eat();
        cat1.play();//现在可以调用了
    }
}
