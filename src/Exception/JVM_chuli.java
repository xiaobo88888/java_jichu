package Exception;

/*JVM默认处理方案
*  把异常的名称，异常的原因，异常出现的位置输出在控制台
*  程序停止运行*/
public class JVM_chuli {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method(){
        int[] a = {1, 2, 3};
        System.out.println(a[3]);//这里显然错误
        /*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        at Exception.JVM_chuli.method(JVM_chuli.java:11)
        at Exception.JVM_chuli.main(JVM_chuli.java:6)

        ArrayIndexOutOfBoundsException  这是异常名称
        Index 3 out of bounds for length 3    这是异常原因
        at Exception.JVM_chuli.method(JVM_chuli.java:11)
        at Exception.JVM_chuli.main(JVM_chuli.java:6)  这是异常出现的位置

        */
        //这是java虚拟机做出的处理
    }
}
