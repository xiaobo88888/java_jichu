package Stream_;

import java.util.*;
import java.util.stream.Stream;

/*
    Stream流的常见生成方式
        1.collection体系的集合可以使用默认方法stream()生成流
            default Stream<E> stream()
        2.Map体系的集合间接生成流
        3.数组可以通过Stream接口的静态方法of(T... values)生成流
 */
public class shengcheng {
    public static void main(String[] args) {
        //1.collection体系的集合可以使用默认方法stream()生成流
        //            default Stream<E> stream()
        List<String> list = new ArrayList<String>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<String>();
        Stream<String> setStream = set.stream();

        //2.Map体系的集合间接生成流
        Map<String, Integer> map = new HashMap<String, Integer>();
        Stream<String> keyStream = map.keySet().stream();//键对应的流
        Stream<Integer> valuesStream = map.values().stream();//值所对应的流
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();//键值对所对应的流

        //3.数组可以通过Stream接口的静态方法of(T... values)生成流
        String[] str = {"liu", "mei", "gao"};
        Stream<String> str1 = Stream.of(str);
        Stream<String> str2 = Stream.of("liu", "yang", "wen", "zou");
        Stream<Integer> itr = Stream.of(1, 2, 3, 4, 5);

    }
}
