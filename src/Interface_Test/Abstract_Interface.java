package Interface_Test;

/*抽象类和接口的区别：
* 成员区别：
*        抽象类：变量，常量；构造方法，抽象方法，非抽象方法
*          接口：常量，抽象方法
* 关系区别：
*        类与类：只能单继承，但是可以多层继承
*        类与接口：可以单实现，也可以多实现
*        接口与接口：可以单继承，也可以多继承
* 设计理念：
*        抽象类：对类抽象，包括行为和属性
*         接口：对行为抽象，主要是行为*/
public class Abstract_Interface extends Abstract implements Interface{
    //一般都是定义一个子类继承抽象类并且实现接口
    @Override
    public void open(){

    }
    @Override
    public void close(){

    }
    @Override
    public void alarm(){

    }

}
