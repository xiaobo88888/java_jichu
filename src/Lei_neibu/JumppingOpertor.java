package Lei_neibu;

public class JumppingOpertor {
    public void method(Jumpping j){//这里需要的是接口的实现类
        /*而正因为这里需要的是Jumpping接口的实现类对象，而匿名内部类的本质就是继承了该类或者实现了
        该接口的匿名对象*/
        j.jump();
    }
}
