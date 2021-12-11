package Exception;

public class zidingyi extends Exception{//非RuntimeException，编译时异常
    public zidingyi(){}

    public zidingyi(String message){
        super(message);
    }
}
