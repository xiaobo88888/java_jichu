package API_changyong;

/*
Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等
日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法

Calender 提供了一个方法getInstance()用于获取Calender对象，其日历字段已使用当前日期和时间
初始化    Calender rightNow = Calender.getInstance();

1.public int get(int field)  返回给定日历字段的值
2.public abstract void add(int field,int amount)
  根据日历的规则，为给定的日历字段添加或减去指定的时间量
3.public final void set(int year,int month,int date)
  设置日历字段 YEAR、MONTH 和 DAY_OF_MONTH 的值
*/
import java.util.Calendar;

public class calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//采用多态的方式获取一个Calender的对象
        //System.out.println(c);
        //public int get(int field)  返回给定日历字段的值
        int year = c.get(Calendar.YEAR);//指示年的 get 和 set 的字段数字
        int month = c.get(Calendar.MONTH) + 1;//指示月份的 get 和 set 的字段数字，
        // 注意月是从0开始的，所以要加一
        int day = c.get(Calendar.DATE);//get 和 set 的字段数字，指示一个月中的某天

        System.out.println(year + "年" + month + "月" + day + "日");


        //展示五年后的三天前
        c.add(Calendar.YEAR, 5);
        c.add(Calendar.DATE, -3);

        int year2 = c.get(Calendar.YEAR);//指示年的 get 和 set 的字段数字
        int month2 = c.get(Calendar.MONTH) + 1;//指示月份的 get 和 set 的字段数字,
        int day2 = c.get(Calendar.DATE);//get 和 set 的字段数字，指示一个月中的某天

        System.out.println(year2 + "年" + month2 + "月" + day2 + "日");


        //设置日历为2035年10月1日
        c.set(2035, 9, 01);//注意字段MONTH是从0开始的，所以实际上月份是10

        int year3 = c.get(Calendar.YEAR);//指示年的 get 和 set 的字段数字
        int month3 = c.get(Calendar.MONTH) + 1;//指示月份的 get 和 set 的字段数字,
        int day3 = c.get(Calendar.DATE);//get 和 set 的字段数字，指示一个月中的某天

        System.out.println(year3 + "年" + month3 + "月" + day3 + "日");
    }
}
