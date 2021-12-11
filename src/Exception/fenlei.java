package Exception;

/*异常
*  就是程序出现了不正常的情况
* 体系：            throwable ：所有异常的超类
*               /              \
*       Error                 Exception
*                            /          \
*                 RuntimeException       非RuntimeException
*
* Error:严重问题，不应该试图捕获它来解决
* Exception:表示异常类，表示程序本身可以处理的问题，可以捕获并解决
*    RuntimeException:在编译期间不检查，出现问题后，再回来修改代码
*    非RuntimeException:编译期就必须处理的，否则程序就不能通过编译，也就不能正常运行
* */
public class fenlei {
}
