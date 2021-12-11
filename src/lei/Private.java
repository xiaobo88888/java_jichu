package lei;

/*
* private关键字
* 代表私有，可以修饰成员变量或者成员方法
* 用private修饰了的属性或方法，只能在本类中使用，不能在其他类中使用*/

/*
* 最好给每一个使用private修饰了的成员变量创建一个set和get方法
* */
public class Private
{
    private String name;
    private int chengji;

    public void setName(String n) {
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setChengji(int c){
        chengji = c;
    }
    public int getChengji(){
        return chengji;
    }

    public void show(){
        System.out.println(name + ":" + chengji);
    }
}

