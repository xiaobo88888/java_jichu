package DuoTai;


public class Cat extends Animal{
    public int age = 20;
    public int weight = 100;
    @Override
    public void eat(){
        System.out.println("小猫吃东西");
    }
    public void play(){
        System.out.println("小猫玩捉迷藏");
    }
}
