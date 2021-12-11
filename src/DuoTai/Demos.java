package DuoTai;

public class Demos {
    public static void main(String[] args) {
        //先创建猫类
        Animals c = new Cats();
        c.setName("喵喵");
        c.setAge(5);
        System.out.println(c.getName() + ' ' + c.getAge());
        c.eat();

        Animals c2 = new Cats("喵呜", 6);
        System.out.println(c2.getName() + ' ' + c2.getAge());
        c2.eat();

        //创建狗类
        Animals d = new Dogs();
        d.setName("汪汪");
        d.setAge(4);
        System.out.println(d.getName() + ' ' + d.getAge());
        d.eat();

        Animals d2 = new Dogs("旺财", 3);
        System.out.println(d2.getName() + ' ' + d2.getAge());
        d2.eat();
    }
}
