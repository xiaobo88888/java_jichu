package API_changyong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*工具类：
*      构造方法私有，成员函数静态
* */


public class Date_gongju {
    private Date_gongju(){};

    /*将日期转为指定格式字符串
    * 返回值类型：String
    * 参数：Date date  String format*/
    public static String datetoString(Date date, String format){
        //format：指定格式
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String s = sdf.format(date);//这里将date日期按照指定格式转化为了字符串
        return s;
    }

    /*把字符串解析为指定格式日期
    * 返回值类型Date
    * 参数：String s   String format*/
    public static Date stringtoDate(String s, String format) throws ParseException {
        //format：指定格式
        SimpleDateFormat sdf = new SimpleDateFormat(format);//这里将s字符串按照指定格式转化为了日期
        Date date = sdf.parse(s);
        return date;
    }
}
