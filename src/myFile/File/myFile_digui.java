package myFile.File;

public class myFile_digui {
    public static void main(String[] args) {
        //斐波那契数列
        int[] arr = new int [20];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println("第20个月的兔子数量：" + arr[19]);

        System.out.println(f(20));
    }
    /*
    * 递归问题，首先就是要先定义一个方法
    *       定义一个方法f(n)，表示第n个月的兔子对数
    *       f(n - 1)表示第n - 1个月的兔子对数
    *       f(n - 2)表示第n - 2个月的兔子对数
    *
    * StackOverflowErro：当堆栈溢出发生时抛出一个应用程序递归太深
    *
    * 递归一定要有出口，不能一直递归下去
    *
    * 递归的原理就是栈，先进后出
    * */
    public static int f(int n){
        if (n <= 2 && n > 0){
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }

}
