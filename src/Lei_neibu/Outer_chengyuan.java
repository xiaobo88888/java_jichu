package Lei_neibu;

public class Outer_chengyuan {
    private String name = "小刘";


    //但是一般我们定义内部类就是不想让外界直接访问它
    /*public class inter_chengyuan {
        public void show(){
            System.out.println(name);
        }
    }*/
    //所以我们一般内部类用private修饰
    //而当内部类用private修饰时，就不能直接在外部访问了
    private class inter_chengyuan {
        public void show(){
            System.out.println(name);
        }
    }
    //所以我们要在外部类中定义方法访问内部类
    public void method(){
        inter_chengyuan i = new inter_chengyuan();
        //这里内部类作为外部类的成员，即使内部类使用private修饰，但内部类还是在外部类中，所以可以直接访问
        i.show();
    }
}
