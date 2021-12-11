package lei;
import java.util.Random;//导包
/*Random
* 作用：用于产生一个随机数*/

/*Math.random
* 作用：随机返回一个[0，1）之间的浮点数*/

/*Random是一个类，Math.random是一个方法*/
public class random_Random
{
    public static void main(String[] args)
    {
        //创建Random类型的对象
        Random a = new Random();
        //用nextInt方法随机读取0~参数值之间的数
        int num = a.nextInt(100);
        int num3 = a.nextInt(100) + 1;
        //可以在后面增加运算，比如这个就是返回[1,100]的值
        float num2 = a.nextFloat();
        //可以使用nextFloat, nextBoolean,nextDouble来返回一个随机的别的类型值，
        // 但是别的类型不能加参数，只有int型可以加参数
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);

        //Math.random
        int b = (int)(Math.random() * 10);
        //因为返回的是浮点型，所以要强转
        //这里也不一定要用int型，别的也可以
        System.out.println(b);
        int[] d = new int[5];
        int i;
        int r;
        for (i = 0; i < d.length; i++)
        //数组名.length可以返回数组长度，即数组元素个数
        {
            r = (int)(Math.random() * 10);
            d[i] = r;
        }
        for (i = 0; i < d.length; i++)
        {
            System.out.println(d[i]);
        }
    }
}
