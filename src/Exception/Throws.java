package Exception;

/*
*  throws 异常类名
*  跟在方法小括号后面
*
*  throws 并不是真正的处理，它只是把异常抛出了，这个可以做个标记位，由调用的来处理
*
*  编译时异常必须要处理： try...catch   throws     如果采用throws，则谁调用谁处理
*  运行时异常可以不处理：因为这种异常一般是要修改代码的
* */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Throws {
    public static void main(String[] args) {
//        method();
        try {
            method2();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    //编译时异常
    public static void method2() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("y-M-d");
        String s = "2021-04-29";
        Date d = sdf.parse(s);
        System.out.println(d);
    }

    //运行时异常
    public static void method() throws ArrayIndexOutOfBoundsException{
        int[] a = {1, 2, 4};
//        System.out.println(a[3]);
        System.out.println(a[2]);

    }
}
