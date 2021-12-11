package duoxiancheng.shixian;

public class MyThread extends Thread{
    public MyThread(){

    }

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.println(getName() + ":" + i);
        }
    }

    //以下解释为什么会得到Thread-*的默认线程名称
    //且解释了带参构造方法怎么设置name值的

    /*
        private volatile(这个修饰符先不管它 ) String name;

        子类无参构造默认访问父类构造方法
        public Thread() {
            this(null, null, "Thread-" + nextThreadNum(), 0);
        }

        public Thread(String name) {
            this(null, null, name, 0);
        }

        public Thread(ThreadGroup group, Runnable target, String name, long stackSize) {
            this(group, target, name, stackSize, null, true);
        }

         private Thread(ThreadGroup g, Runnable target, String name,
                   long stackSize, AccessControlContext acc,
                   boolean inheritThreadLocals) {

              this.name = name;
         }

        public final String getName() {
            return name;
        }

        private static int threadInitNumber;//这个默认初始化应该为0
        private static synchronized int nextThreadNum() {
            return threadInitNumber++;//后置加加，所以先返回0
        }
     */

    /*
        public final synchronized void setName(String name) {
            this.name = name;
        }
     */
}
