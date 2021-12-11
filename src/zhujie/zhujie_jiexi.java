package zhujie;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 框架类
 */
@pro(className = "zhujie.Method1", methodName = "show")
public class zhujie_jiexi {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //1.解析注解，获取该类的字节码文件对象
        Class<zhujie_jiexi> aClass = zhujie_jiexi.class;
        //2.获取上边的注解对象
        //其实就是在内存中生成了一个该注解接口的子类实现对象
        /*
        //返回的是注解被使用时填入的值

            public class ProImpl implement pro{
                return "src.zhujie.Method1";
            }
            public String methodName(){
                return "show";
            }
        }
         */
        pro an = aClass.getAnnotation(pro.class);
        //调用注解对象中定义的抽象方法（属性），获取返回值
        String className = an.className();
        String methodName = an.methodName();

        System.out.println(className);
        System.out.println(methodName);

        //加载该类进内存
        Class cls = Class.forName(className);
        //创建对象
        Object obj = cls.newInstance();
        //获取方法对象
        Method method = cls.getMethod(methodName);
        //执行方法
        method.invoke(obj);


    }

}
