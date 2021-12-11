package hanshushi_interface.changyong;


import java.util.function.Supplier;

/*
    Supplier<T>:包含一个无参的方法
        T get();获得结果
        该方法不需要参数，它会按照某种实现逻辑(由Lambda表达式实现)返回一个数据
        Supplier<T>接口也被称为生产性接口，如果我们指定了接口的泛型是什么类型，那么接口中的get()方法就会生产什么类型的数据供我们使用
 */
public class Supplier_ {
    public static void main(String[] args) {
        //匿名内部类实现
        String s = getString(new Supplier<String>() {
            @Override
            public String get() {
                return "我好累";
            }
        });
        System.out.println(s);

        //Lambda表达式
        String ss = getString(() -> "我好累啊");
        System.out.println(ss);


        //匿名内部类实现
        Integer i = getInt(new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 10;
            }
        });
        System.out.println(i);

        //Lambda表达式
        Integer ii = getInt(() -> 10);
        System.out.println(ii);
    }

    //定义一个方法，返回整数数据
    private static Integer getInt(Supplier<Integer> i){
        return i.get();
    }

    //定义一个方法，返回字符串数据
    private static String getString(Supplier<String> s){
        return s.get();
    }
}
