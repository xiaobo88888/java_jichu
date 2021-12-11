package lei;

public class PhoneDemo {
    public static void main(String[] args){//首先main方法加载到栈内存
        Phone p = new Phone();
        //凡是new出来的对象，都是分配在堆内存的，是有默认值的

        System.out.println(p);//这里输出的是地址值
        System.out.println(p.brand);
        System.out.println(p.price);
        //所以这里输出一个是null，一个是0.0，因为一个是String一个是float

        //通过对象给类中成员变量赋值
        p.brand = "小";
        p.price = 3000;

        System.out.println(p.brand);
        System.out.println(p.price);

        //调用方法
        p.call();
        p.duanxin();
        //方法加载到栈内存，调用完后释放


        Phone p2 = p;//这里p的值赋给了p2
        p2.brand = "大";
        p2.price = 2999;
        //p2和p指向相同，这里通过p2对象修改了成员变量

        System.out.println(p2.brand);
        System.out.println(p2.price);

        System.out.println(p.brand);
        System.out.println(p.price);

    }//main方法结束后，main方法在栈内存释放
}
