package yinyong;

/*
    gouzaoqi_接口中定义了一个抽象方法,gouzaoqi build(String name, int age);
 */
public class gouzaoqi_Demo {
    public static void main(String[] args) {
        //Lambda表达式
        usebuild((String name, int age) ->{
//            gouzaoqi g = new gouzaoqi(name, age);
//            return g;
            return new gouzaoqi(name, age);
        });

        //Lambda表达式简写
        usebuild((name, age) -> new gouzaoqi(name, age));

        //引用构造器
        usebuild(gouzaoqi::new);//name,age被传递给gouzaoqi类中的带参构造方法了
        //Lambda表达式被构造器替代后，它的形式参数全部传递给构造器作为参数
    }
    private static void usebuild(gouzaoqi_ g){
        gouzaoqi person = g.build("刘博", 19);

        System.out.println(person.getName() + ":" + person.getAge());
    }
}
