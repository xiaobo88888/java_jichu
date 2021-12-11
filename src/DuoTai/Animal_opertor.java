package DuoTai;

public class Animal_opertor {
    /*public void opertor(Cat c){
        c.eat();
    }
    public void opertor(Dog d){
        d.eat();
    }*/

    //其实小猫小狗传递过来的都是动物类的子类
    //多态可以使用父类型参数，操作时使用子类型执行，但是多态不能使用子类型特有的功能
    public void opertor(Animal a){
        a.eat();
    }
}
