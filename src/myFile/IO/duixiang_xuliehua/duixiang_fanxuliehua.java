package myFile.IO.duixiang_xuliehua;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
    ObjectInputStream 对以前使用 ObjectOutputStream 写入的基本数据和对象进行反序列化。

    构造方法：
        ObjectInputStream(InputStream in);创建从指定 InputStream 读取的 ObjectInputStream。

    反序列化对象的方法：
       public final Object readObject()
            从 ObjectInputStream 读取对象
 */
public class duixiang_fanxuliehua {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\java_File\\序列化对象.txt"));

        Object o = ois.readObject();

        //向下转型
        Student s = (Student) o;
        System.out.println(s.getName() + "," + s.getAge());

        ois.close();

    }
}
