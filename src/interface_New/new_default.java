package interface_New;

public interface new_default {
    void show1();

    void show2();

//    void show3();如果多加一个抽象方法，那么该接口的实现类就要修改，要重写新的抽象方法
//                 或者再定义一个接口，继承该接口，将新的抽象方法放到子接口中去，但这样太麻烦了

    //所以java提供了默认方法
//    public default void show3(){
//        System.out.println("show3");//该方法可以不需要实现类重写，如果实现类想重写也可以，但注意重写的时候要去掉default
//    }

    //public 可以省略
    default void show3(){
        System.out.println("show3");
    }
}
