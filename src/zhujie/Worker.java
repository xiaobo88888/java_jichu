package zhujie;

@MyAnno(show1 = 1, per = Person.p1, show3 = @MyAnno2, show4 = {"aa", "bb"})
//使用注解需要给属性赋值
//多个属性，逗号隔开
@MyAnno3
public class Worker {

    public int aa;

    @MyAnno3
    public void show(){

    }
}
