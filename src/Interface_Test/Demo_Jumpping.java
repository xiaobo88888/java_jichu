package Interface_Test;

public class Demo_Jumpping {
    public static void main(String[] args) {
        jumppings j = new Cats();
        j.jump();

        Animal a = new Dogs();
        a.setName("旺财");
        a.setAge(5);
        a.eat();

        Animal a2 = new Dogs("汪汪", 4);
        a2.eat();
//        a2.jump();//这样子直接写会报错
        ((Dogs)a2).jump();//Animals类里面没有jump()方法，只能强转成子类来调用


        Cats c = new Cats("喵呜", 3);
        //类Cats中继承了父类Animal并且实现了接口jumppings，所以一般就不用多态的形式了
        c.eat();
        c.jump();
        //这样就可以直接调用了，就不需要类型转换了
    }
}
