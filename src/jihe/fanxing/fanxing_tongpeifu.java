package jihe.fanxing;

/*
*   类型通配符：<?>
            List<?>:表示元素类型未知的List，它的元素可以匹配任何类型
            这种带通配符的List仅表示各种泛型List的父类，并不能把元素添加到其中

    类型通配符上限<? extends 类型>
            List<? extends Number>:它表示的是Number或者其子类型

    类型通配符下限<? super 类型>
            List<? super Number>:它表示的是Number或者其父类

*
*       extends意思是继承，继承肯定是继承父类，而extends T，意思就是最多继承到T类型，T类型往下的都可以继承
*       super意思是调用父类，super T，肯定是最少也要调用父类到T类型，T类型往上的都可以调用
*
* */

import java.security.DrbgParameters;
import java.util.ArrayList;
import java.util.List;

public class fanxing_tongpeifu {
    public static void main(String[] args) {
        //Object --- Number --- Integer  由大到小

        //类型通配符：<?>
        List<?> f1 = new ArrayList<Object>();
        List<?> f2 = new ArrayList<Number>();
        List<?> f3 = new ArrayList<Integer>();

        //类型通配符上限<? extends 类型>
//        List<? extends Number> f4 = new ArrayList<Object>();
        List<? extends Number> f5 = new ArrayList<Number>();
        List<? extends Integer> f6 = new ArrayList<Integer>();

        //类型通配符下限<? super 类型>
        List<? super Number> f7 = new ArrayList<Object>();
        List<? super Number> f8 = new ArrayList<Number>();
//        List<? super Number> f9 = new ArrayList<Integer>();
    }
}
