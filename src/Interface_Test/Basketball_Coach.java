package Interface_Test;

public class Basketball_Coach extends Coach{
    public Basketball_Coach() {
    }

    public Basketball_Coach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃牛肉");
    }
}
