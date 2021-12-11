package DuoTai;

public class Cats extends Animals{
    public Cats() {
    }

    public Cats(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
