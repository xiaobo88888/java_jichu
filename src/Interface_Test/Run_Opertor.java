package Interface_Test;

/*
* 接口作为类的形参，需要的是该接口的实现类对象
* 接口作为类的返回值，返回的是该接口的实现类对象*/
public class Run_Opertor {
    //接口作为类的形参
    public void setRun(Run r){
        //这里传来的是new Run_Dog()，所以相当于Run r = new Run_Dog()
        r.run();
    }

    //接口作为类的返回值
    public Run getRun(){
        Run r = new Run_Dog();
        return r;
    }
}
