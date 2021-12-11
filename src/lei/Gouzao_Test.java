package lei;

public class Gouzao_Test {
    public static void main(String[] args){
        Gouzao g = new Gouzao(1, 110);
        //这里的new Gouzao()其实相当于一个方法，这个方法就是构造方法
        //如果构造方法，且构造方法中定义了参数，则new时必须传递参数，除非类中同时还定义了无参构造方法

        g.show();
    }
}
