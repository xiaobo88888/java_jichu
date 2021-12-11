package interface_New;

public class Demo3_private {
    public static void main(String[] args) {
        new_private np = new new_private_demo();

        np.show1();
        System.out.println("-----------");

        np.show2();
        System.out.println("-----------");

        new_private.method1();
        System.out.println("-----------");

        new_private.method2();
        System.out.println("-----------");


    }
}
