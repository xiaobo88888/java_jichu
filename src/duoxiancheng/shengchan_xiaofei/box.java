package duoxiancheng.shengchan_xiaofei;

/*
    奶箱类(box)：定义一个成员变量，表示第x瓶奶，提供存储牛奶和获取牛奶的操作

    IllegalMonitorStateException
            抛出的异常表明某一线程已经试图等待对象的监视器，或者试图通知其他正在等待对象的监视器而本身没有指定监视器的线程。
            监视器指代锁对象


 */
public class box {
    private int milk;
    private boolean zt = false;//奶箱的状态

//    public void put(int milk){
    public synchronized void put(int milk){
        if(zt) {
            //如果有奶的话，等待消费
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //如果没有奶，则生产奶
        this.milk = milk;
        System.out.println("送奶工将第" + this.milk + "瓶奶放入奶箱");

        //生产完毕，修改状态
        zt = true;

        //唤醒其他等待的线程
        notifyAll();
    }

//    public void get(){
    public synchronized void get(){
        //如果没有牛奶，等待生产
        if(!zt){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //如果有牛奶，则消费牛奶
        System.out.println("消费者拿到第" + this.milk + "瓶奶");

        //修改奶箱状态
        zt = false;

        //唤醒其他等待的线程
        notifyAll();
    }
}
