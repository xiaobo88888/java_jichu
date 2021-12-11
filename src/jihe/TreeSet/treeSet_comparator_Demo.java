package jihe.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class treeSet_comparator_Demo {
    public static void main(String[] args) {
        TreeSet<Scorce> ts = new TreeSet<Scorce>(new Comparator<Scorce>() {
            @Override
            public int compare(Scorce s1, Scorce s2) {
                int num = (s2.getChinese() + s2.getMath()) - (s1.getChinese() + s1.getMath());
                return num;
//                return 0;
            }
        });

        Scorce s1 = new Scorce("刘博", 100,100);
        Scorce s2 = new Scorce("煤球", 99, 99);
        Scorce s3 = new Scorce("高辉", 100,100);
        Scorce s4 = new Scorce("永恒", 99,98);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for (Scorce s : ts){
            System.out.println(s.getName());
        }
    }
}
