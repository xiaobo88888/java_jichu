package jihe.myMap;

import String_Test.StringBuilder_Test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*  需求：键盘录入一个字符串，统计每个字符出现的次数
*        举例：键盘录入”abababccc“，输出"a(2)b(2)c(3)"
*
*   思路：
*       1.键盘录入字符串
*       2.创建HashMap集合，键是Character，值是Integer
*       3.遍历字符串，得到每一个字符
*       4.将得到的字符作为键到HashMap集合中去找对应的值，通过返回值判断
*               如果返回值是null，说明该键在集合中不存在，则把该字符作为键，1作为值添加到集合中去
*               如果返回值不是null，说明该键在集合中存在，则把该值+1，并把键重新存入到集合中去
*                   (HashMap集合，如果键相同，值会覆盖之前的值)
*       5.遍历HashMap集合，拼接输出结果
* */
public class myMap_zifucishu {
    public static void main(String[] args) {
        //1.键盘录入字符串
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一串字符");
        String s = in.nextLine();

        //2.创建HashMap集合，键是Character，值是Integer
//        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();//使用HashMap输出的是乱序的
        TreeMap<Character, Integer> hm = new TreeMap<Character, Integer>();//对键进行排序

        // 3.遍历字符串，得到每一个字符
        for (int i = 0; i < s.length(); i++){
            char key = s.charAt(i);
            //4.将得到的字符作为键到HashMap集合中去找对应的值，通过返回值判断
            Integer value = hm.get(key);//如果没有该键key对应的值value，则会返回null

            if (value == null){
                //如果返回值是null，说明该键在集合中不存在，则把该字符作为键，1作为值添加到集合中去
                hm.put(key, 1);
            }else{
                //如果返回值不是null，说明该键在集合中存在，则把该值+1，并把键重新存入到集合中去
                //(HashMap集合，如果键相同，值会覆盖之前的值)
                value++;
                hm.put(key, value);
            }
        }

        // 5.遍历HashMap集合，拼接
        StringBuilder sb = new StringBuilder();

        Set<Character> keySet = hm.keySet();
        for (Character key : keySet){
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }

        //输出结果
        String result = sb.toString();
        System.out.println(result);
    }
}
