package Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
*  java中异常分为两大类，编译时异常、运行时异常,也成为受检异常和非受检异常，或者是非RuntimeException异常和RuntimeException异常
*  所有的RuntimeException类及其子类的实例被称为运行时异常，其他的异常都是编译时异常
*
*  编译时异常：必须显示处理，否则程序会发生错误，无法通过编译   有可能出现问题
*  运行时异常：无须显示处理，也可以和编译时异常一样处理
* */
public class RuntimeException_fei {
    public static void main(String[] args) {
        method();
        method2();
    }

    //编译时异常
    public static void method2(){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("y-M-d");
            String s = "2021-04-29";
            Date d = sdf.parse(s);
            System.out.println(d);
        } catch(ParseException e){
            e.printStackTrace();
        }
    }

    //运行时异常
    public static void method(){
        try {
            int[] a = {1, 2, 4};
            System.out.println(a[3]);
        } catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
