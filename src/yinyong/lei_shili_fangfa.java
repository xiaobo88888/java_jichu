package yinyong;

/*
    定义了一个接口，里面有一个抽象方法String mysubString(int start, int end);
 */
public class lei_shili_fangfa {
    public static void main(String[] args) {
        //Lambda表达式
        useprint((String s, int start, int end) -> {
            return s.substring(start, end);
        });

        //Lambda表达式简化
        useprint((s, start, end) -> s.substring(start, end));

        //引用类的成员方法
        useprint(String::substring);//s调用方法substring，start,end作为substring的参数
        //Lambda表达式被引用类的实例方法替代后，第一个参数作为调用着，剩下的参数全部传递给类的实例方法作为参数
    }

    private static void useprint(lei_shili_fangfa_ l){
        String s = l.mysubString("hello, world", 0, 8);
        System.out.println(s);
    }
}
