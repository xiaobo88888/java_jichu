package abstract_lei;

/*
* 方法的形参是抽象类名，其实需要的是子类对象
* 方法的返回值是抽象类名，其实返回的也是子类对象*/
public class AnimalOpertor {
    //抽象类作为形参
    public void setAnimals_(Animals_ a){
        //这里传来了new Cats_()，相当于Animals_ a = new Cats_()
        a.eat();
    }

    //抽象类作为返回值
    public Animals_ getAnimals_(){
        Animals_ a = new Cats_();
        return a;//这里返回的相当于new Cats_()
    }
}
