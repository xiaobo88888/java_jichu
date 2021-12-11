package jihe.fanxing;

/*泛型接口的实现类是泛型类*/

public class fanxing_jiekou<T> implements fanxing_jiekou_interface<T> {
    //重写show方法
    @Override
    public T show(T t) {
        return t;
    }
}
