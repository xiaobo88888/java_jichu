package jihe.myMap;

import java.util.*;

/*  集合嵌套，在HashMap集合中存储ArrayList对象
*           1.创建HashMap集合
*           2.创建ArrayList集合对象
*           3.添加ArrayList集合对象到HashMap集合中
*           4.遍历HashMap集合
* */
public class myMap_HashMap_ArrayList {
    public static void main(String[] args) {
        // 1.创建HashMap集合
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

        //2.创建ArrayList集合对象
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("刘博");
        arr1.add("煤球");
        arr1.add("高辉");

        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("杨杰");
        arr2.add("文昌");
        arr2.add("子昇");

        ArrayList<String> arr3 = new ArrayList<String>();
        arr3.add("蒋雯佳");
        arr3.add("朱林燕");
        arr3.add("沈林溪");

        //3.添加ArrayList集合对象到HashMap集合中
        hm.put("好基友", arr1);
        hm.put("男寝", arr2);
        hm.put("女寝", arr3);

        // 4.遍历HashMap集合
        Set<String> strings = hm.keySet();//先得到HashMap集合的键集合，这里的键集合是无序的
        for(String s : strings){//遍历每一个键
            ArrayList<String> arr = hm.get(s);//通过键来得到值(ArrayList)
            ListIterator<String> li = arr.listIterator();//通过List集合的迭代器来遍历ArrayList集合
            while(li.hasNext()){
                String next = li.next();
                System.out.println(s + ":" + next);
            }
        }
    }
}
