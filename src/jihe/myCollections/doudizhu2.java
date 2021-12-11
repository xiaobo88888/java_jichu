package jihe.myCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*      需求：
            斗地主升级版，要洗牌，发牌，看牌，而且要对牌进行排序
        思路：
            1.创建HashMap，键是编号，值是牌
*           2.创建ArrayList，存储编号
*           3.创建花色数组和点数数组
*           4.从0开始往HashMap里存储编号，同时也存储对应的牌，同时ArrayList也存储编号
*           5.洗牌，洗的是编号，用Collectiosn的shuffle()方法
*           6.发牌，发的也是编号，为保证牌有序，用TreeSet集合接收
*           7.定义看牌方法，遍历TreeSet集合，获取编号，并到HashMap集合中去找牌
            8.调用看牌方法
*/
public class doudizhu2 {
    public static void main(String[] args) {
        //1.创建HashMap，键是编号，值是牌
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        //2.创建ArrayList，存储编号
        ArrayList<Integer> arr = new ArrayList<Integer>();

        //3.创建花色数组和点数数组
        //♠ ♣ ♥ ◆ 四种花色
        String colors[] = {"♠", "♣", "♥", "◆"};//花色数组
        String nums[] = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};//牌数数组

        //4.从0开始往HashMap里存储编号，同时也存储对应的牌，同时ArrayList也存储编号
        int index = 0;//定义编号

        //因为是排序索引来排序牌，所以牌集合应该按照牌数来排好序
        for(String num : nums){
            for(String color : colors){//这样写是按数字排序
//        for(String color : colors){
//            for(String num : nums){//这样写是按花色排序
                hm.put(index, color + num);
                arr.add(index);
                index++;
            }
        }
        hm.put(index, "小王");
        arr.add(index);
        index++;
        hm.put(index, "大王");
        arr.add(index);

        // 5.洗牌，洗的是编号，用Collectiosn的shuffle()方法
        Collections.shuffle(arr);

        // 6.发牌，发的也是编号，为保证牌有序，用TreeSet集合接收
        TreeSet<Integer> ts1 = new TreeSet<Integer>();
        TreeSet<Integer> ts2 = new TreeSet<Integer>();
        TreeSet<Integer> ts3 = new TreeSet<Integer>();
        TreeSet<Integer> dp = new TreeSet<Integer>();

        for(int i = 0; i < arr.size(); i++){
            Integer x = arr.get(i);//获取的是ArrayList集合的索引
            if(i >= arr.size() - 3){
                dp.add(x);
            } else if(i % 3 == 0){
                ts1.add(x);
            } else if(i % 3 == 1){
                ts2.add(x);
            } else if(i % 3 == 2){
                ts3.add(x);
            }
        }

        // 8.调用看牌方法
        kanpai("刘博", ts1, hm);
        kanpai("煤球", ts2, hm);
        kanpai("高辉", ts3, hm);
        kanpai("底牌", dp, hm);
    }

    //7.定义看牌方法，遍历TreeSet集合，获取编号，并到HashMap集合中去找牌
    public static void kanpai(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm){
        System.out.print(name + "的牌是：");
        for (Integer key : ts){
            String poker = hm.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }

}
