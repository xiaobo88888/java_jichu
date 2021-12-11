package Lambda;

/*
    需求：启动一个线程，在控制台输出一句话“多线程启动”
 */
public class tiyan {
    public static void main(String[] args) {
        //通过类实现Runnable接口
        ThreadRunnable tr = new ThreadRunnable();
        Thread th = new Thread(tr);
        th.start();

        //匿名内部类改进
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程启动");
            }
        }).start();

        //Lambda表达式改进
        new Thread( () -> {
            System.out.println("多线程启动");
        }).start();
    }
}
