package API_changyong;

/*Date
* 构造方法：public Date()
*        public Date(long date) 以表示自从标准基准时间（称为“历元（epoch）”，即 1970 年 1 月 1 日 00:00:00 GMT）以来的指定毫秒数。
*
* 方法：public long getTime() 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数
*      public void setTime(long time) 设置此 Date 对象，以表示 1970 年 1 月 1 日 00:00:00 GMT 以后 time 毫秒的时间点
* */
import java.util.Date;

public class date {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);//Date类重写了toString方法，所以这里会输出当前电脑具体时间


        long date = 1000;
        Date d2 = new Date(date * 60 * 60 * 24);
        System.out.println(d2);

        //public long getTime()
        //这个和public static long currentTimeMillis()方法类似，都是返回从1970/1/1零点返回的毫秒数
        Date dd = new Date();
        System.out.println(dd);
        System.out.println(dd.getTime());
        System.out.println(dd.getTime() * 1.0/ 1000/ 60/ 60/ 24/ 365 + "年");

        //public void setTime(long time)
        //这个和Date类的构造方法public Date(long date)类似
        long time = 1000 * 60 * 60 * 24;
        dd.setTime(time);
        System.out.println(dd);
    }
}
