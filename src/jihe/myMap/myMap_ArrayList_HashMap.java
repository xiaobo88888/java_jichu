package jihe.myMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*  集合嵌套，在ArrayList集合中存储HashMap集合对象
*       1.创建ArrayList集合
*       2.创建HashMap集合
*       3.添加HashMap集合到ArrayList集合中去
*       4.遍历ArrayList集合
* */
public class myMap_ArrayList_HashMap {
    public static void main(String[] args) {
        //1.创建ArrayList集合
        ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();

        //2.创建HashMap集合
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("19", "刘博");
        hm.put("20", "煤球");
        hm.put("22", "龙哥");

        HashMap<String, String> hm2 = new HashMap<String, String>();
        hm2.put("帅哥", "刘博");
        hm2.put("汉子", "煤球");
        hm2.put("运动", "高辉");

        HashMap<String, String> hm3 = new HashMap<String, String>();
        hm3.put("帅哥", "刘博");
        hm3.put("汉子", "煤球");
        hm3.put("受伤", "高辉");

        //3.添加HashMap集合到ArrayList集合中去
        array.add(hm);
        array.add(hm2);
        array.add(hm3);

        //4.遍历ArrayList集合
        for (HashMap<String, String> m : array){//首先遍历ArrayList集合得到每一个HashMap对象，这个HashMap对象是有序的
            Set<String> s = m.keySet();//然后通过HashMap对象的keySet()方法得到HashMap对象的键集合，键集合是无序的
            for (String key : s){//然后遍历键集合
                String value = m.get(key);//根据键来得到值
                System.out.println(key + ":" + value);
            }
        }
    }
}
