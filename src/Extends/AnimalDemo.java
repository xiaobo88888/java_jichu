package Extends;

public class AnimalDemo {
    public static void main(String[] args){
      //无参构造
        Dog dog = new Dog();
        dog.setName("旺财");
        dog.setAge(8);
        System.out.println(dog.getName() + ',' + dog.getAge());
        dog.kan();


        Cat cat = new Cat();
        cat.setName("喵喵");
        cat.setAge(4);
        System.out.println(cat.getName() + ',' + cat.getAge());
        cat.zhua();

        //有参构造
        Dog dog1 = new Dog("汪汪", 5);
        System.out.println(dog1.getName() + ',' + dog1.getAge());
        dog1.kan();

        Cat cat1 = new Cat("喵呜", 4);
        System.out.println(cat1.getName() + ',' + cat1.getAge());
        cat1.zhua();
    }
}
