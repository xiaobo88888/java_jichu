package Interface_Test;

public class Basketball_Player extends Player implements Learn_English{
    public Basketball_Player() {
    }

    public Basketball_Player(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("篮球运动员学篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员不爱吃牛肉");
    }

    @Override
    public void English() {
        System.out.println("篮球运动员要学英语");
    }
}
