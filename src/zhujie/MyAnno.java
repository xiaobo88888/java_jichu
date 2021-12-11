package zhujie;

public @interface MyAnno {
    int show1();
    String show2() default "张三";//如果不给值，就默认
    Person per();
    MyAnno2 show3();

    String[] show4();
}
