package API_changyong;

/*
* 装箱：将基本数据类型转化为对应的包装类类型
*     public static Integer valueOf(int i)
* 拆箱：将包装类类型转化为对应的基本数据类型
*     public int intValue()
*
* 自动装箱与自动拆箱：自动类型转化*/
public class xiang_zhuang_chai {
    public static void main(String[] args) {
        //装箱
        int i = 100;
        Integer ii = Integer.valueOf(i);//将int型转化成Integer型
        //自动装箱，自动类型转化
        ii = i;//这里隐含了一个Integer.valueOf方法

        //拆箱
        int i2 = ii.intValue() + 200;//将Integer型转化成int型
        Integer iii = i2;//自动装箱

        ii += 200;//== ii = ii + 200;
                  //先用ii+200自动拆箱(将Integer的ii先转化成int型再++)，
                  //然后ii = ii + 200自动装箱(将ii + 200这个int型转化成Integer型)
        System.out.println(ii);
    }
}
