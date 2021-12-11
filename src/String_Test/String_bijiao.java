package String_Test;

/*
 * equals方法
 * 比较两个字符串内容是否相同*/

public class String_bijiao {
    public static void main(String[] args){
        //构造方法创建字符串
        char[] zifu = {'a', 'b', 'c'};
        String s1 = new String(zifu);
        String s2 = new String(zifu);

        //直接赋值方法创建字符串
        String s3 = "abc";
        String s4 = "abc";

        //比较地址是否相同
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);

        //比较字符串内容是否相同
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
