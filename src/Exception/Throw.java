package Exception;

/*L*/

public class Throw {
    public void checkscore(int sorce) throws zidingyi{//由于zidingyi异常是继承自编译时异常，所以这里必须得抛出，如果是继承运行时异常，则可以抛出可以不抛出
        if(sorce < 0 || sorce > 100){
            //这里由于是自定义的异常，所以需要我们主动抛出
            //这里创建一个异常对象
//            throw new zidingyi();
            System.out.println("找到了异常");
            throw new zidingyi("分数超过范围，范围因在0-100");//这里传递的字符串就是异常原因
            //抛出异常后面不能写语句，因为根本不会执行语句
        }else{
            System.out.println("分数正常");
        }
    }
}
