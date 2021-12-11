package Interface_Test;

public class Demo_Run {

    public static void main(String[] args) {
        //接口作为类的形参
        Run_Opertor ro = new Run_Opertor();
        Run r = new Run_Dog();//接口无法直接创建对象，所以需要实现类对象
        ro.setRun(r);

        //接口作为类的返回值
        Run r2 = ro.getRun();//这里返回new Run_Dog()，所以相当于Run r2 = new Run_Dog()
        r2.run();
    }
}
