package hanshushi_interface;

/*
@FunctionalInterface
public interface Runnable {
    public abstract void run();
}

        */
public class fangfa_canshu {
    public static void main(String[] args) {
        //匿名内部类的方式
        useRunnable(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程启动了");
            }
        });

        //Lambda表达式
        useRunnable(() -> System.out.println(Thread.currentThread().getName() + "线程启动了"));
    }
    private static void useRunnable(Runnable r){
//        Thread t = new Thread(r);
//        t.start();
        new Thread(r).start();
    }
}
