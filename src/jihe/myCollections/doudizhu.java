package jihe.myCollections;

import java.util.ArrayList;
import java.util.Collections;

/*  需求：
        通过程序实现斗地主的洗牌、发牌和看牌
    思路：
        1.创建一个牌盒——也就是定义一个集合对象，用ArrayList集合实现
        2.往牌盒里装牌
        3.洗牌，把牌打散——用Collections的shuffle()方法实现
        4.发牌——遍历集合，给三个玩家发牌
        5.看牌——三个玩家分别遍历自己的牌
*/
public class doudizhu {
    public static void main(String[] args) {
        //1.创建一个牌盒——也就是定义一个集合对象，用ArrayList集合实现
        ArrayList<String> array = new ArrayList<String>();

        //2.往牌盒里装牌
        //♠ ♣ ♥ ◆ 四种花色
        String colors[] = {"♠", "♣", "♥", "◆"};//花色数组
        String nums[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};//牌数数组
        for(String color : colors){
            for(String num : nums){
                array.add(color + num);//字符串拼接再添加进集合中
            }
        }
        array.add("小王");
        array.add("大王");

        //3.洗牌，把牌打散——用Collections的shuffle()方法实现
        Collections.shuffle(array);

        //4.发牌——遍历集合，给三个玩家发牌
        ArrayList<String> array1 = new ArrayList<String>();
        ArrayList<String> array2 = new ArrayList<String>();
        ArrayList<String> array3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();

        for (int i = 0; i < array.size(); i++){
            String poker = array.get(i);//遍历每一张扑克牌
            if(i >= array.size() - 3){//如果是底牌
                dipai.add(poker);
            } else if(i % 3 == 0){//分别放入三位玩家的牌集合中
                array1.add(poker);
            } else if(i % 3 == 1){
                array2.add(poker);
            } else if(i % 3 == 2){
                array3.add(poker);
            }
        }

        // 5.看牌——三个玩家分别遍历自己的牌
        kanpai("刘博", array1);
        kanpai("煤球", array2);
        kanpai("高辉", array3);
        kanpai("底牌", dipai);
    }

    public static void kanpai(String name, ArrayList<String> array){
        System.out.print(name + "的牌是：");
        for (String s : array){
            System.out.print(s + " ");
        }
        System.out.println();
    }

}
