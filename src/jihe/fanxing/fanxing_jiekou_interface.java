package jihe.fanxing;

/*  泛型接口的定义格式
*               格式：修饰符 interface 接口名<类型>{}
*               范例：public interface fanxing_jiekou_interface<T>{}*/

public interface fanxing_jiekou_interface<T>{
    //接口中的方法默认publci abstract
    T show(T t);
}
