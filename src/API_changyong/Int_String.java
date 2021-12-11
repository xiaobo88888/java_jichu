package API_changyong;

public class Int_String {
    public static void main(String[] args) {
        //int 转 String

        //方法一
        int i = 100;
        String s = "" + i;//通过字符串的拼接
        System.out.println(s);
        //方法二
        String s1 = String.valueOf(i);
        //通过String类中的方法valueOf()来转换
        System.out.println(s1);

        System.out.println("---------");

        //String 转 int

        //方法一
        String s2 = "1000";
        Integer i2 = Integer.valueOf(s2);//Integer类的valueOf()方法，将String类型转为Integer
        int i3 = i2.intValue();//Integer类的intValue()方法，将Integer转为int型
        System.out.println(i3);
        //通过Integer作为桥梁，先将String转为Integer类型，再把Integer转为int类型
        //方法二
        int i4 = Integer.parseInt(s2);
        //Integer类的parseInt()方法，接收一个String类型，转换成一个int型，
        //parseInt()的字符串参数除了第一个字符可以是表示负数的-，其他的必须全是int型
        System.out.println(i4);
    }
}
