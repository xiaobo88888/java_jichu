package abstract_lei;

public class Dogs extends Animals{
    public Dogs() {
    }

    public Dogs(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
