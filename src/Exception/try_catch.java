package Exception;

/* Throwable 的成员方法
*  public String getMessage()  返回异常的原因
*  public String toString()    返回异常的名称和错误原因
*  public void printStackTrace()    将所有错误信息输出在控制台上
* */
public class try_catch {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method(){
        try {
            int[] a = {1, 2, 3};
            System.out.println(a[3]);//这里有异常，所以会创建一个异常对象
                                     // new ArrayIndexOutOfBoundsException(“xxx”); 这里其实传递了字符串，该字符串为错误的原因
                                     //该异常是java提供的，所以如果没有主动抛出，编译器会自动抛出throw new ArrayIndexOutOfBoundsException("xxx");
        } catch(ArrayIndexOutOfBoundsException e){//然后系统检测到了类型匹配的对象，就执行这段语句
                   //e = new ArrayIndexOutOfBoundsException(); e是对象名

//            System.out.println("索引越界");

//            public String getMessage()  返回异常的原因
//            System.out.println(e.getMessage());

//            public String toString()    返回异常的名称和错误原因
//            System.out.println(e.toString());

//            public void printStackTrace()    将所有错误信息输出在控制台上
            e.printStackTrace();//把异常的错误信息输出在控制台
        }
    }
}
/*
* public class throwable{
*   private String detaimessage;
*
*   public throwable(String message){
*       detailmessage = message;
*   }
*   public String getMessage(){
*       return detailmessage;
*   }
* }*/
