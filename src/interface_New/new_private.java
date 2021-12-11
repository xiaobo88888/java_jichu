package interface_New;

public interface new_private {

    //私有方法
    private void show(){
        System.out.println("刘博最帅");
        System.out.println("煤球傻逼");
    }
    default void show1(){
        System.out.println("show1开始执行");
//        System.out.println("刘博最帅");
//        System.out.println("煤球傻逼");

        show();
//        method();//非静态方法可以调用静态方法
        System.out.println("show1结束");
    }
    default void show2(){
        System.out.println("show2开始执行");
//        System.out.println("刘博最帅");
//        System.out.println("煤球傻逼");

        show();
//        method();//非静态方法可以调用静态方法
        System.out.println("show2结束");
    }


    //私有静态方法
    private static void method(){
        System.out.println("刘博最帅");
        System.out.println("煤球傻逼");
    }
    static void method1(){
        System.out.println("method1开始执行");
//        System.out.println("刘博最帅");
//        System.out.println("煤球傻逼");

//        show(); 静态方法中不能调用非静态方法
        method();
        System.out.println("method1结束");
    }
    static void method2(){
        System.out.println("method2开始执行");
//        System.out.println("刘博最帅");
//        System.out.println("煤球傻逼");

//        show(); 静态方法中不能调用非静态方法
        method();
        System.out.println("method2结束");
    }

}
