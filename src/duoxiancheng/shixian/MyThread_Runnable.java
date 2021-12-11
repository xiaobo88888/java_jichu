package duoxiancheng.shixian;

public class MyThread_Runnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
//            System.out.println(getName() + ":" + i);
            //该类是实现了Runnable接口的，没有继承Thread类，所以不能直接使用getName()方法
            System.out.println(Thread.currentThread().getName() + ":" + i);
            //先得到当前执行线程的线程名引用，再能调用getName()方法
        }
    }
}
