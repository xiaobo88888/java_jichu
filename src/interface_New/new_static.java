package interface_New;

public interface new_static {
    void show1();

    default void show2(){
        System.out.println("new_static中的默认方法被调用了");
    }

    //静态方法
//    public static void show3(){
//        System.out.println("new_static中的静态方法被调用了");
//    }

    //可以省略public
    static void show3(){
        System.out.println("new_static中的静态方法被调用了");
    }
}
