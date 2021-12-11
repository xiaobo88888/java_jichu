package Exception;

import java.util.Scanner;

public class throw2_test {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = in.nextInt();

        Throw2 t = new Throw2();
        t.checkInt(num);
    }
}
