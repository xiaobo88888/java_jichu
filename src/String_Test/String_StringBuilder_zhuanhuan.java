package String_Test;

/*
* StringBuilder转成String类，通过toString()方法，因为toString方法返回的是String类型的
* String转成StringBuilder类，通过StringBuilder构造传递String类对象
* StringBuilder也有length()方法， 返回长度*/
public class String_StringBuilder_zhuanhuan {
    public static void main(String[] args){
        //StringBuilder转换为String类
        StringBuilder s1 = new StringBuilder();
        s1.append("age");
//        String s2 = s1;
        String s2 = s1.toString();
        System.out.println(s2);


        //String转换成为StringBuilder类
        String s3 = "abc";
//        StringBuilder s4 = s3;
        StringBuilder s4 = new StringBuilder(s3);
        System.out.println(s4);
    }
}
