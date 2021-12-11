package Interface_Test;

//public class InterImpl implements Inter{  等价于
public class InterImpl extends Object implements Inter{
    public InterImpl(){
        super();
        /*这里super调用的是Object类的构造方法，因为类InterImpl没有显示继承父类，接口本身
          又没有构造函数，所以这里super调用的就是Object类的构造函数*/
        /*Object类是所有类的超类，所有类都继承父类Object或者间接继承
        * 而Object类创建对象是无参的，所以这里super()调用了Object类*/
    }
    @Override
    public void method() {

    }

    @Override
    public void get() {

    }
}
