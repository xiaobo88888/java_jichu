package Extends;

public class PhoneDemo {
    public static void main(String[] args){
        Phone p = new Phone();
        p.call("刘博");

        NewPhone np = new NewPhone();
        np.call("刘博");
    }
}
