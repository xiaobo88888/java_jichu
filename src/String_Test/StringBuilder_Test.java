package String_Test;

/*
 * StringBuilder创建的对象，可以随意添加，删除，插入
 * StringBuilder对象.append()方法，插入(数字或者字符或者字符串等等)到StringBuilder对象后面
 * 对象.reverse()，反转对象*/
public class StringBuilder_Test {
    public static void main(String[] args){
        StringBuilder s = new StringBuilder();
        s.append("hello");
        s.append("world");
        System.out.println(s);

        StringBuilder s2 = new StringBuilder();
        //append方法可以一直添加，因为append方法返回对象本身
        s2.append("hello").append("world").append("java");
        System.out.println(s2);

        //字符串反转
        System.out.println(s2.reverse());
    }
}
