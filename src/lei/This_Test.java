package lei;

public class This_Test {
    public static void main(String[] args){
        This t = new This();

        t.setName("小博");
        t.setSalary(10000);

        System.out.println(t.getName() + "/" + t.getSalary());

        //创建t和t2两个对象，通过哪个对象调用属性和方法，this就指代哪个对象

        This t2 = new This();

        t2.setName("煤球");
        t2.setSalary(5000);

        System.out.println(t2.getName() + "," + t2.getSalary());
    }
}
