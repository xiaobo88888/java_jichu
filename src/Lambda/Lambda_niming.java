package Lambda;

public class Lambda_niming {
    public static void main(String[] args) {
        //区别一：Lambda表达式只能在接口中使用，而匿名内部类可以在接口中、抽象类中、具体类中使用

        //匿名内部类
//        usejiekou(new Jiekou_() {
//            @Override
//            public void jiekou() {
//                System.out.println("接口");
//            }
//        });
//        usechouxiang(new Chouxiang() {
//            @Override
//            public void chouxiang() {
//                System.out.println("抽象");
//            }
//        });
//        usejuti(new Juti(){
//            @Override
//            public void juti() {
//                System.out.println("具体");
//            }
//        });

        //Lambda表达式
//        usejiekou(() -> System.out.println("接口"));
//        usechouxiang(() -> System.out.println("抽象"));
//        usejuti(() -> System.out.println("具体"));




        //区别二：当接口中有两个抽象方法时，Lambda表达式无法使用，但匿名内部类可以使用

//        usejiekou(() -> System.out.println("接口"));

        usejiekou(new Jiekou_() {
            @Override
            public void jiekou() {
                System.out.println("接口1");
            }

            @Override
            public void jiekou2() {
                System.out.println("接口2");
            }
        });

    }
    private static void usejuti(Juti j){
        j.juti();
    }
    private static void usechouxiang(Chouxiang c){
        c.chouxiang();
    }
    private static void usejiekou(Jiekou_ j){
        j.jiekou();
    }
}
