package API_changyong;

import java.util.Arrays;

/*将字符串中的整形数据排序
*
* 1.先提取出字符串中的整形数据，将字符串分割成几个小字符串，这些小字符串包含整形数据
*   例：String类的"25 35 8 13 88 65" 分隔成 String[] 的["25", "35", "8", "13", "88", "65"]
*   这里需要用到String类的方法，public String[] split(String regex)
*    该方法作用是可以根据给给定的字符串regex来拆分字符串
*     例：一个字符串"aa:bb:cc"调用了split方法，传递参数":"，则得到的结果为字符串数组
*         字符串数组的元素为["aa", "bb", "cc"]
*
* 2.将字符串数组中的元素转变成整形，就是说将String转换成int型
*   这里可以用Integer类的方法parseInt， public static int parseInt(String s)
 *   它接收一个String类型，然后返回一个int型
 *
* 3.将得到的整形数组排序，可以用Arrays类的方法sort来从小到大排序
*
* 4.将整形数组撰写成一个字符串，这里需要用到StringBuilder类，它可以拼接，将接收到的参数拼接成一个字符序列
*
* 5.将StringBuilder类转换成String类，将字符序列转化成字符串表示形式
*   public String toString()
* */
public class stringbuilder {
    public static void main(String[] args) {
        String s = "33, 55, 98, 13, 35, 45";
        //提取字符串中的数据，分割成字符串数组
        String[] s1 = s.split(", ");
//        for (int i = 0; i < s1.length; i++){
//            System.out.println(s1[i]);
//        }
        int[] it= new int[s1.length];//整形数组元素个数由字符串数组元素个数决定
        //将字符串数组中的每个元素转换成int型并赋给int数组
        for (int i = 0; i < s1.length; i++){
            it[i] = Integer.parseInt(s1[i]);
        }
        //给整形数组排序
        Arrays.sort(it);
        //用StringBuilder拼接成一个字符序列
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length; i++){
            if(i == s1.length - 1){
                sb.append(it[i]);
            }
            else{
                sb.append(it[i]).append(" ");
            }
        }
        //将StringBuilder类转化成String类，返回字符序列的字符串表示形式
        s = sb.toString();
        System.out.println(s);
    }
}
