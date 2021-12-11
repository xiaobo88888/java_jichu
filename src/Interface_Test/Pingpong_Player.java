package Interface_Test;

public class Pingpong_Player extends Player implements Learn_English{
    public Pingpong_Player() {
    }

    public Pingpong_Player(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("乒乓球运动员学篮球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员不爱吃牛肉");
    }

    @Override
    public void English() {
        System.out.println("乒乓球运动员要学英语");
    }
}
