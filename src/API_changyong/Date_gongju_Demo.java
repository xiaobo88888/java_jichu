package API_changyong;

import java.text.ParseException;
import java.util.Date;

public class Date_gongju_Demo {
    public static void main(String[] args) throws ParseException {
        //创建Date对象
        Date date = new Date();
        String s = Date_gongju.datetoString(date, "yyyy年MM月dd HH:mm:ss");
        System.out.println(s);

        //创建字符串对象
        String ss = "2002-04-28 21:10:10";
        Date date2 = Date_gongju.stringtoDate(ss, "yyyy-MM-dd HH:mm:ss");
        System.out.println(date2);
    }
}
