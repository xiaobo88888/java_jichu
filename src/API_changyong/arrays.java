package API_changyong;

/*
* Arrays  Math   System
* 这些都是工具类
* 工具类的设计理念：
*       构造方法：用private修饰---》防止外界创建对象
*       成员方法：用public static修饰---》强制让你用类名调用*/
import java.lang.reflect.Array;
import java.util.Arrays;

/*Arrays类
* public static String toString(int[] a)  返回指定数组的字符串内容表示形式
*
* public static void sort(int[] a)   按照数字顺序从小到大排列指定数组*/
public class arrays {
    public static void main(String[] args) {
        int[] a = {43, 24, 65, 19, 24, 13};

        System.out.println("排序前：" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("排序后；" + Arrays.toString(a));
    }
}
