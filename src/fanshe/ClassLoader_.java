package fanshe;

/*
    ClassLoader中的两个方法：
        static ClassLoader getSystemClassLoader();  返回用于委派的系统类加载器
        ClassLoader getParent();   返回父类加载器进行委派
 */
public class ClassLoader_ {
    public static void main(String[] args) {
        //static ClassLoader getSystemClassLoader();  返回用于委派的系统类加载器
        ClassLoader gcl = ClassLoader.getSystemClassLoader();
        System.out.println(gcl); //AppClassLoader

        //ClassLoader getParent();   返回父类加载器进行委派
        ClassLoader gcl2 = gcl.getParent();
        System.out.println(gcl2);  //PlatformClassLoader

        ClassLoader gcl3 = gcl2.getParent();
        System.out.println(gcl3); //null

    }
}
