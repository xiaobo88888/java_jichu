package API_changyong;

import lei.Scanner_Test;

import java.util.Calendar;
import java.util.Scanner;

public class calenderDemo {
    public static void main(String[] args) {
        //获取年份
        System.out.println("请输入你想要的年份");
        Scanner in = new Scanner(System.in);
        int year= in.nextInt();

        //创建日历对象，设置当前日历的年月日
        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);

        //修改当前天数
        c.add(Calendar.DATE, -1);

        int day = c.get(Calendar.DATE);

        System.out.println(year + "年二月有" + day + "天");
    }
}
