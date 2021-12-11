package String_Test;

public class String_gouzao {
    public static void main(String[] args){
        //创建空白字符串，这时s1是String类的对象
        String s1 = new String();
        System.out.println("s1:" + s1);

        //根据字符数组内容，创建字符串对象
        char[] zifu = {'a', 'b', 'c'};
        String s2 = new String(zifu);
        System.out.println("s2:" + s2);

        //根据字节数组内容，创建字符串对象
        byte[] zijie = {97, 98, 99};
        String s3 = new String(zijie);
        System.out.println("s3:" + s3);

        //直接赋值，创建字符串
        String s4 = "abc";
        System.out.println("s4:" + s4);
        //推荐使用直接赋值创建字符串
    }
}
