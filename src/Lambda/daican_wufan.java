package Lambda;

public class daican_wufan {
    public static void main(String[] args) {
        //匿名内部类
        usejiekou2(new jiekou2() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("我快没电了");
            }
        });

        System.out.println("---------------");

        //Lambda表达式
        usejiekou2((String s) -> {
            System.out.println(s);
            System.out.println("我快没电了");
        });
    }
    private static void usejiekou2(jiekou2 j){
        j.fly("啊啊啊啊");
    }
}
