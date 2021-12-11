package lei;

/*
* 构造方法
* 修饰符 类名（参数）
* 构造方法不需要类型名，而且一般用public修饰
* 名字和类名相同
* 如果类中没有定义构造方法，则系统会自行给我们一个默认的无参构造方法，如果定义了构造方法，则不会给*/
public class Gouzao {
    private int bianhao;
    private int phone;

    public Gouzao(int bianhao, int phone){
        this.bianhao = bianhao;
        this.phone = phone;
    }
    public Gouzao(){
        System.out.println("无参构造");
    }
    //两个构造方法，new创建对象时根据传递的参数来自动匹配构造方法，这就是重载函数

    public void show(){
        System.out.println(bianhao + ":" + phone);
    }
}
