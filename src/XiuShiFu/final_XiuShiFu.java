package XiuShiFu;

/*final
* 修饰类：表明该类是最终类，不能被继承
* 修饰方法：表明该方法是最终方法，不能被重写
* 修饰变量：表明该变量是常量，不能被再次赋值
* 修饰局部变量：如果修饰的是基本类型，则表明该基本类型的数据值不能变
*             如果修饰的是引用类型，则表明该引用类型的地址值不能变，但是地址里面的内容可以变*/
public class final_XiuShiFu {
    public static void main(String[] args) {
        //修饰基本类型
        final int age = 20;
//        age = 100;//基本类型数据值不能变
        System.out.println(age);

        //修饰引用类型
        final final_ f = new final_();
        f.age = 100;//地址里的内容可以改变
        System.out.println(f.age);

//        f = new final_();//地址值不能改变
    }
}
