package Exception;

import java.util.Scanner;

public class throw_test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个分数：");
        int sorce = in.nextInt();
        Throw t = new Throw();

        try {//编译时异常，需要显示处理
            t.checkscore(sorce);
        } catch (zidingyi zidingyi) {
            zidingyi.printStackTrace();
        }

        System.out.println("结束");
    }
}
