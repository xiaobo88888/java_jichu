package Interface_Test;

public class Demo_Inter {
    public static void main(String[] args) {
        Inter i = new InterImpl();

//        i.num = 15;
        System.out.println(i.num);
//        i.num2 = 25;
        System.out.println(i.num2);

        System.out.println(Inter.num);
        System.out.println(Inter.num2);
        //类名调用
    }
}
