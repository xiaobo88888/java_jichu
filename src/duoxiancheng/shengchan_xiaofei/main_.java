package duoxiancheng.shengchan_xiaofei;
/*
    思路：
        奶箱类(box)：定义一个成员变量，表示第x瓶奶，提供存储牛奶和获取牛奶的操作
        生产者类(producer)：实现Runnable接口，重写run方法，调用存储牛奶的操作
        消费者类(customer)：实现Runnable接口，重写run方法，调用获取牛奶的操作
        定义测试类(main_)：
                创建奶箱对象，这是共享数据区域
                创建生产者对象，把奶箱对象作为构造方法的参数传递，因为在这个类中要调用存储牛奶的操作
                创建消费者对象，把奶箱对象作为构造方法的参数传递，因为在这个类中要调用获取牛奶的操作
                创建两个线程对象，分别把生产者对象和消费者对象作为构造方法的参数传递
                启动线程
 */
public class main_ {
    public static void main(String[] args) {
        //创建奶箱对象，这是共享数据区域
        box box = new box();

        //创建生产者对象，把奶箱对象作为构造方法的参数传递，因为在这个类中要调用存储牛奶的操作
        producer pro = new producer(box);

        //创建消费者对象，把奶箱对象作为构造方法的参数传递，因为在这个类中要调用获取牛奶的操作
        customer cus = new customer(box);

        //创建两个线程对象，分别把生产者对象和消费者对象作为构造方法的参数传递
        Thread t1 = new Thread(pro);
        Thread t2 = new Thread(cus);

        //启动线程
        t1.start();
        t2.start();

    }
}
