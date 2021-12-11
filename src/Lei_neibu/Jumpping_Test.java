package Lei_neibu;

public class Jumpping_Test {
    public static void main(String[] args) {
        JumppingOpertor jo = new JumppingOpertor();
        Jumpping j = new Jumpping_Cat();
        jo.method(j);
        //如果采用多态的方式，每次调用都需要创建一个类，所以可以采用匿名内部类的方式

        JumppingOpertor jo2 = new JumppingOpertor();
        jo2.method(new Jumpping() {
            //所以这里可以直接使用匿名内部类的形式，创建接口的实现类，并将其传递过去
            @Override
            public void jump() {
                System.out.println("猫在这也可以跳高了");
            }
        });//注意这里，匿名内部类是在小括号内的，整个匿名内部类就相当于上面的 j
           //而j和这里的匿名内部类都是接口的实现类对象或者子类的匿名对象
    }
}
