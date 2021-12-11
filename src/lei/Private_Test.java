package lei;

public class Private_Test {
    public static void main(String[] args){
        Private p = new Private();

//        p.name = "小博";  //通过private修饰的属性，就不能在其他类通过对象调用了
        p.show();

        p.setName("小博");
        p.setChengji(100);
        p.show();

        System.out.println(p.getName() + "." + p.getChengji());
    }
}
