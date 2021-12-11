package Lambda;

public class wucan_wufan {
    public static void main(String[] args) {
        //在主函数中调用方法实现
        jiekou_shixian js = new jiekou_shixian();
        usejiekou(js);

        //匿名内部类实现
        usejiekou(new jiekou() {
            @Override
            public void eat() {
                System.out.println("我快没电了");
            }
        });

        //Lambda表达式
        usejiekou( () -> {
            System.out.println("我快没电了");
        });
    }
    private static void usejiekou(jiekou j){//这里的参数是接口类型的，实参要的是接口的实现类对象
        j.eat();
    }
}
