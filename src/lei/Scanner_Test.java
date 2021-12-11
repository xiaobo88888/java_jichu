package lei;

import java.util.Scanner;

public class Scanner_Test {
    public static void main(String[] args){
        int a;
        float b;
        String c;
        boolean d;
        Scanner in = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        c = in.nextLine();
        System.out.println("请输入一个整数");
        a = in.nextInt();
        System.out.println("请输入一个浮点数");
        b = in.nextFloat();
        System.out.println("情书一个布尔型");
        d = in.nextBoolean();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
