package jihe.fanxing;

/*
*       可变参数：又称可变参数个数，用作方法的形参出现，那么方法参数个数就是可变了的
*           格式；修饰符 返回值类型 方法名 (数据类型... 变量名){}
*           范例：public static int sum(int... a){}
*
*           注意事项：可变参数的变量其实是个数组
*                   如果一个方法包含多个参数，其中一个参数还是可变参数，那么可变参数应该放到参数
*                   列表中的最后面*/

public class fanxing_kebiancanshu {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
        System.out.println(sum(10, 20, 30, 40, 50));
        System.out.println(sum(10, 20, 30, 40, 50, 60));
        System.out.println(sum(10, 20, 30, 40, 50, 60, 70));
    }
//    public static int sum(int... i, int b){ 可变参数应该放到参数列表中的最后面
    public static int sum(int b, int...i){
        return 0;
    }
    /*public static int sum(int... i){
//        System.out.println(i);//从这可以看出i是个数组，它将传入的实参都封装到数组中去了
//        System.out.println(i[0]);
        int sum = 0;
        for (int s : i){
            sum += s;
        }
        return sum;
    }*/
//    public static int sum(int i1, int i2){
//        return i1 + i2;
//    }
//    public static int sum(int i1, int i2, int i3){
//        return i1 + i2 + i3;
//    }
//    public static int sum(int i1, int i2, int i3, int i4){
//        return i1 + i2 + i3 + i4;
//    }
}
