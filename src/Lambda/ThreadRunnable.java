package Lambda;

import Interface_Test.Run;

public class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("多线程启动");
    }
}
