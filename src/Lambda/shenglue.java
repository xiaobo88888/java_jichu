package Lambda;

public class shenglue {
    public static void main(String[] args) {
        //原型
        useAdd((int x, int y) -> {
            return x + y;
        });
        //省略参数类型
        useAdd((x, y) -> {
            return x + y;
        });
        //但要注意如果有多个参数，全部的参数都要省略
//        useAdd((x, int y) -> {
//            return x + y;
//        });


        //原型
        useFly((String s) -> {
            System.out.println(s);
        });
        //省略小括号类型(但这是在省略参数类型的情况下)——只有一个参数的情况下
//        useFly(String s -> {
//            System.out.println(s);
//        });
        useFly(s -> {
            System.out.println(s);
        });


        //原型
        useFly(s -> {
            System.out.println(s);
        });
        //这个可以加上类型和小括号
        useFly((String s) -> System.out.println(s));
        //省略大括号和分号(都得省)——在代码块的语句只有一条的情况下
        useFly(s -> System.out.println(s));



        //原型
        useFly(s -> {
            System.out.println(s);
        });
        //参数类型和小括号可以不省略
        useAdd(( int x, int y) ->  x + y);
        //省略大括号和分号(都得省)——在代码块的语句只有一条的情况下，如果这条语句还有return，return也得省略
        useAdd((x, y) -> x + y);

    }
    private static void useAdd(Add a){
        int num = a.add(10, 20);
        System.out.println(num);
    }
    private static void useFly(Fly f){
        f.fly("我快没电了");
    }
}
