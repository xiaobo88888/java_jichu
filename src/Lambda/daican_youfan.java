package Lambda;

public class daican_youfan {
    public static void main(String[] args) {
        //匿名内部类
        usejiekou3(new jiekou3() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        });

        //Lambda表达式
        usejiekou3( (int x, int y) -> {
            return x + y;
        });

    }
    private static void usejiekou3(jiekou3 j){
        int sum = j.add(10, 20);
        System.out.println(sum);
    }
}
