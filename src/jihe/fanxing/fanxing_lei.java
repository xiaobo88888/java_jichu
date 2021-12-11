package jihe.fanxing;

/*
* 泛型类定义格式：
*       格式：修饰符 class 类名 <类型>{}
*       范例：public class fanxing_lei <T>{}
*               此处的T可以写任意的标识符，常见的如T、E、K、V等形式的参数用于表示泛型
*       好处：这样就不需要写很多的类*/
public class fanxing_lei<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
