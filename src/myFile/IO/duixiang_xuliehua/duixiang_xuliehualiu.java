package myFile.IO.duixiang_xuliehua;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
    构造方法：
    ObjectOutputStream(OutputStream out)
          创建写入指定 OutputStream 的 ObjectOutputStream。
          可以创建一个FileOutputStream

    序列化对象的方法：
        public final void writeObject(Object obj)
            将指定的对象写入 ObjectOutputStream

     NotSerializableException：当实例需要具有序列化接口时，抛出此异常。序列化运行时或实例的类会抛出此异常。
     Serializable：类通过实现 java.io.Serializable 接口以启用其序列化功能。未实现此接口的类将无法使其任何状态序列化或反序列化。
        这个接口中没有方法，这只是一个表示，当一个类实现了这个接口，代表它可以被序列化或者反序列化
 */
public class duixiang_xuliehualiu {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\java_File\\序列化对象.txt"));

        Student s = new Student("刘博", 19);

        oos.writeObject(s);

        oos.close();
    }
}
