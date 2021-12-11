package Extends;

/*
* 方法重写
* 子类继承父类时，子类有一个方法的声明和父类的一个方法一致（方法名，参数列表，返回值一致）
* 则说子类重写了父类的方法
* 但还要注意一点，方法前面的访问修饰符，子类中重写的方法必须要大于等于父类方法的访问权限
* 访问权限：public > protected > 默认（不写）> private
* 但访问权限中，如果父类的方法定义的是private，则子类根本不能继承，也就无法重写*/

/*
* @Override注解
* 可以帮助我们检查重写方法的声明的正确性*/

public class NewPhone extends Phone{
    //父类也有一个call方法，方法重写
    @Override//注解，检查重写方法声明是否正确
    public void call(String name){
        System.out.println("先给" + name + "视频");
        System.out.println("给" + name + "打电话");
    }

//    @Override
//    private void method(){
//        System.out.println("aaa");
//    }//子类无法继承父类中private定义的方法

    @Override
//    void fangfa(){
//        System.out.println("bbb");
//    }
    public void fangfa(){//这里添加了public没有报错
        System.out.println("bbb");
    }
}
