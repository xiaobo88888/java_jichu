package lei;

/*
* this指代本类
* 如下面代码，由于参数与属性名相同，所以如果不加this，则编译器会把两个都理解为参数*/
public class This {
    private String name;
    private float salary;

    public void setName(String name){
        this.name = name;
        //参数名和属性名都一样，所以要加个this
    }
    public String getName(){
        return name;
    }

    public void setSalary(float salary){
        this.salary = salary;
    }
    public float getSalary(){
        return salary;
    }
}
