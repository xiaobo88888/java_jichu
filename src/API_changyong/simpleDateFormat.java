package API_changyong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*SimpleDateFormat
* 构造方法：
*        public SimpleDateFormat()  创建一个SimpleDateFormat，使用默认模式和日期格式
*        public SimpleDateFormat(String pattern)  构造一个SimpleDateFormat，使用给定的模式和默认的日期格式
*
* 格式化：从Date到String
*       public final String format(Date date) 将日期格式化成日期/时间字符串
*
* 解析：从String到Date
*      public Date parse(String source) 从给定字符串的开始解析文本以生成信息*/

/*
* G  Era 标志符  Text  AD
y  年  Year  1996; 96
M  年中的月份  Month  July; Jul; 07
w  年中的周数  Number  27
W  月份中的周数  Number  2
D  年中的天数  Number  189
d  月份中的天数  Number  10
F  月份中的星期  Number  2
E  星期中的天数  Text  Tuesday; Tue
a  Am/pm 标记  Text  PM
H  一天中的小时数（0-23）  Number  0
k  一天中的小时数（1-24）  Number  24
K  am/pm 中的小时数（0-11）  Number  0
h  am/pm 中的小时数（1-12）  Number  12
m  小时中的分钟数  Number  30
s  分钟中的秒数  Number  55
S  毫秒数  Number  978
z  时区  General time zone  Pacific Standard Time; PST; GMT-08:00
Z  时区  RFC 822 time zone  -0800
*/
public class simpleDateFormat {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat();//2021/4/24 下午9:17 这是默认模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MMM月dd日 HH:mm:ss");
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss"); 结果一致

        String s = sdf.format(date);//按照指定的pattern将date日期转化为了字符串
        System.out.println(s);

        String ss = "2021-04-28 12:12:12";
//        SimpleDateFormat sdf2 = new SimpleDateFormat("y年M月d日 H:m:s");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//要和给定的字符串匹配
        Date dd = sdf2.parse(ss);//按照指定的pattern将字符串ss转化为了日期
        System.out.println(dd);
    }
}
