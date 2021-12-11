package abstract_lei;

public class DemoAnimals {
    public static void main(String[] args) {
        Animals a = new Cats();
        a.setAge(4);
        a.setName("喵喵");
        System.out.println(a.getAge() + ' ' + a.getName());
        a.eat();

        Animals a2 = new Cats("喵呜", 5);
        System.out.println(a2.getAge() + ' ' + a2.getName());
        a2.eat();

        Animals b = new Dogs();
        b.setAge(5);
        b.setName("汪汪");
        System.out.println(b.getAge() + ' ' + b.getName());
        b.eat();

        Animals b2 = new Dogs("旺财", 6);
        System.out.println(b2.getAge() + ' ' + b2.getName());
        b2.eat();
    }
}
