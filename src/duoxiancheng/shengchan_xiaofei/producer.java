package duoxiancheng.shengchan_xiaofei;

/*
    生产者类(producer)：实现Runnable接口，重写run方法，调用存储牛奶的操作
 */
public class producer implements Runnable{

    private box box;

    public producer(box box){
        this.box = box;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++){
            box.put(i);
        }
    }
}
