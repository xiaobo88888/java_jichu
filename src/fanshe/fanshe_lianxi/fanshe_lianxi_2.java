package fanshe.fanshe_lianxi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

public class fanshe_lianxi_2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //创建Properties
        Properties pr = new Properties();

        //先读取文件中的信息
        FileReader fr = new FileReader("src\\fanshe\\test2.txt");
        pr.load(fr);//从输入字符流中读取键值对
        fr.close();

        /*读取到了这样的数据
            classAddress=fanshe.fanshe_lianxi.Student
            classMethod=learnMore,刘博
         */

        //根据键得到值
        String classAddress = pr.getProperty("classAddress");
        String classMethod = pr.getProperty("classMethod");

        //字符串变量classMethod里面不仅有方法名，还有参数
        String[] strings = classMethod.split(",");//根据,分隔出方法名和参数

        //先得到类的Class对象，通过Class的静态方法forName()，这里只需要把类的全路径穿过去就行
        Class<?> className = Class.forName(classAddress);

        //然后创建类的对象
        Constructor<?> constructor = className.getDeclaredConstructor();
        Object obj = constructor.newInstance();

        //然后创建类的方法对象，传递方法名和参数的类型的Class对象
        Method method = className.getDeclaredMethod(strings[0], String.class);

        //通过方法对象调用方法，这里传递类的对象和实参
        method.invoke(obj, strings[1]);

    }
}
