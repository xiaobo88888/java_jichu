package jihe.fanxing;

/*
*   泛型方法：
*       格式：修饰符 <类型> 返回值类型 方法名(类型 变量名) {}
*       格式：public <T> T show(T t){}
*
*       好处：可以不需要写很多重载方法*/


//public class fanxing_fangfa {
//    //普通方法重载
//    public String show(String s){
//        return s;
//    }
//    public Integer show(Integer i){
//        return i;
//    }
//    public Boolean show(Boolean b){
//        return b;
//    }
//}

//泛型类改进
//public class fanxing_fangfa<T>{
//    public T show(T t){
//        return t;
//    }
//}

//泛型方法改进
public class fanxing_fangfa{
    public <T> T show(T t){
        return t;
    }
}
