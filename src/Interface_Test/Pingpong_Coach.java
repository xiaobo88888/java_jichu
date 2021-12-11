package Interface_Test;

public class Pingpong_Coach extends Coach{
    public Pingpong_Coach() {
    }

    public Pingpong_Coach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃羊肉");
    }
}
