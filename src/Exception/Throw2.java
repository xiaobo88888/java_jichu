package Exception;

public class Throw2 {
    public void checkInt(int num) throws zidingyi2{
        if(num < 1 || num > 10) {
            throw new zidingyi2("数字输入错误，应该为1~10");
        }else{
            System.out.println("数字输入正确");
        }
    }
}
