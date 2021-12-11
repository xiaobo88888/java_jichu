package fanshe.fanshe_lianxi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class fanshe_lianxi_wenjianpeizhi {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //创建Properties对象
        Properties pr = new Properties();

        //读取文件中的键值对数据
        FileReader fr = new FileReader("src\\fanshe\\test.txt");//路径名要给对
        pr.load(fr);
        fr.close();

        /*拿到了这样的数据
        classAddress=fanshe.fanshe_lianxi.Student
        classMethod=learn
         */

        //通过键得到值
        String classAddress = pr.getProperty("classAddress");//fanshe.fanshe_lianxi.Student
        String classMethod = pr.getProperty("classMethod");//learn

        //通过反射来使用
        //先得到类的Class对象
        Class<?> className = Class.forName(classAddress);//fanshe.fanshe_lianxi.Student

        //得到类的对象
        Constructor<?> constructor = className.getConstructor();
        Object obj = constructor.newInstance();

        //得到方法对象
        Method method = className.getDeclaredMethod(classMethod);//learn

        //暴力反射
        method.setAccessible(true);

        //调用方法
        method.invoke(obj);

    }
}
