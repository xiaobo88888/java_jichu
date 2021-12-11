package myFile.IO.duixiang_xuliehua;

import java.io.*;

/*
    1、用对象序列化流序列化了一个对象后，加入我们修改了对象所属的类文件，读取数据会不会出问题
        InvalidClassException: myFile.IO.duixiang_xuliehua.Student;
        local class incompatible:
            stream classdesc serialVersionUID = 2615238712902796681,
            local class serialVersionUID = -2909823743973809362

        InvalidClassException:
            当 Serialization 运行时检测到某个类具有以下问题之一时，抛出此异常。
                该类的序列版本号与从流中读取的类描述符的版本号不匹配
                该类包含未知数据类型
                该类没有可访问的无参数构造方法

         Serializable:
            序列化运行时使用一个称为 serialVersionUID 的版本号与每个可序列化类相关联，该序列号在反序列化过程中
            用于验证序列化对象的发送者和接收者是否为该对象加载了与序列化兼容的类。如果接收者加载的该对象的类的
            serialVersionUID 与对应的发送者的类的版本号不同，则反序列化将会导致 InvalidClassException。

        由于write和read时，Student类中被修改了，导致了产生了两个版本号，两个版本号不相等，所有读取就会有误

    2、如果出了问题，该如何解决
        序列化运行时使用一个称为 serialVersionUID 的版本号与每个可序列化类相关联，该序列号在反序列化过程
        中用于验证序列化对象的发送者和接收者是否为该对象加载了与序列化兼容的类。

        可序列化类可以通过声明名为 "serialVersionUID" 的字段（该字段必须是静态 (static)、最终 (final)
        的 long 型字段）显式声明其自己的 serialVersionUID：
        ANY-ACCESS-MODIFIER static final long serialVersionUID = 42L;

        序列化类必须声明一个明确的 serialVersionUID 值。还强烈建议使用 private 修饰符显示声明
        serialVersionUID（如果可能）

     解决方法： 给对象所属的类加一个值：private static final long serialVersionUID = 42L;(42L可修改)


    3、如果一个对象中的某个成员变量的值不想被序列化，该如何实现
        使用transient修饰成员变量
 */
public class wenti {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //write();
        read();
    }

    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\java_File\\序列化对象.txt"));

        Object o = ois.readObject();

        //向下转型
        Student s = (Student) o;
        System.out.println(s.getName() + "," + s.getAge());

        ois.close();
    }

    private static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\java_File\\序列化对象.txt"));

        Student s = new Student("刘博", 19);

        oos.writeObject(s);

        oos.close();
    }

}
