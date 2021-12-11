package abstract_lei;

public class Demo_xingcan_return {
    public static void main(String[] args) {
        //抽象类作为形参
        Animals_ a = new Cats_();
        //因为Animals_是抽象类，无法创建对象，所以需要创建子类来使用多态创建对象
        AnimalOpertor ao = new AnimalOpertor();
        ao.setAnimals_(a);

        //抽象类作为返回值
        Animals_ a2 = ao.getAnimals_();
        //这里返回的是new Cats_()，Animals_ a2 = new Cats_()
        a2.eat();
    }
}
