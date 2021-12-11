package duoxiancheng.shengchan_xiaofei;


/*
    消费者类(customer)：实现Runnable接口，重写run方法，调用获取牛奶的操作
 */
public class customer implements Runnable {
    private box box;

    public customer(box box){
        this.box = box;
    }
    @Override
    public void run() {
        while(true){
            box.get();
        }
    }
}
