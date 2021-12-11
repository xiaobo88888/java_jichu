package zhujie;

@SuppressWarnings("all")
public class Demo2 {

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1(){
        //有缺陷
    }

    //@SuppressWarnings("all")
    public void show2(){
        //替代show1方法
        //不能删除show1方法，如果删去，那么就不兼容了
    }

    public void demo(){
        show1();//该方法已被标注为过时
    }
}
