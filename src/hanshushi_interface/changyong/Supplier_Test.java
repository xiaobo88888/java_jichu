package hanshushi_interface.changyong;

import java.util.function.Supplier;

public class Supplier_Test {
    public static void main(String[] args) {
        int[] a = {1, 50, 2, 98, 34, 53};

        //匿名内部类
        Integer max = getInt(new Supplier<Integer>() {
            @Override
            public Integer get() {

                int max = a[0];
                for (int i = 1; i < a.length; i++) {
                    if (a[i] > max) {
                        max = a[i];
                    }
                }
                return max;
            }
        });
        System.out.println(max);

        //Lambda表达式
        Integer maxx = getInt(() -> {
            int max2 = a[0];
            for (int i = 1; i < a.length; i++) {
                if (a[i] > max2) {
                    max2 = a[i];
                }
            }
            return max2;
        });
        System.out.println(maxx);
    }

    //返回整形数组中的最大值——这个操作是在Lambda表达式中实现的
    private static Integer getInt(Supplier<Integer> i){
        return i.get();
    }
}
