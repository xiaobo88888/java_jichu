package myFile.File;

public class myFile_digui_jiecheng {
    public static void main(String[] args) {
        System.out.println("5的阶乘为：" + f(5));
    }
    public static int f(int n){
        if (n == 1){
            return 1;
        }
        return n * f(n - 1);
    }
}
