package API_changyong;

/*基本数据类型包装类
* 将基本数据类型封装成对象可以在对象中定义更多的功能方法操作该数据
* 常用的基本操作之一：用于基本数据类型和字符串类型之间的转换
*
*     基本数据类型              包装类
*       byte                   Byte
*       short                  Short
*       int                    Integer
*       long                   Long
*       float                  Float
*       double                 Double
*       char                   Character
*       boolean                Boolean
* 基本类型中除了int和char，其他的包装类都是首字母大写*/
/*
*   构造方法：
*           public Integer (int value)    根据int值创建Integer对象
*           public Integer (String value) 根据String值创建Integer对象
*           (都过时了)
*
*   静态方法获取对象：
*           public static Integer valueOf(int i)   返回表示指定的int值的Integer实例
*           public static Integer valueOf(String s)   返回一个保存指定String值的Integer对象
*
*   以后要想得到Integer的对象，采用静态工厂的方法创建valueOf()
*
* Integer类的常量MAX_VALUE表示int型的范围最大值2^31-1
*               MIN_VALUE表示int型的范围最小值 -2^31
* */
public class integer {
    public static void main(String[] args) {
//        Integer i = new Integer(100);
//        Integer i2 = new Integer(1000);

        Integer i = Integer.valueOf(200);
        System.out.println(i);

        Integer i2 = Integer.valueOf("100");
        System.out.println(i2);

//        Integer i3 = Integer.valueOf("abc");
//        System.out.println(i3);
        //注意这里给的字符串的是数字型的，不然会报错

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
