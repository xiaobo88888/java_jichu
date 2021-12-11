package jihe.mySet_HashSet;

/*哈希值：
*       是JDK根据对象的地址或者字符串或者数字算出来的int类型的数值
*
* Object类中有一个方法可以获取对象的哈希值：
*       public int hashCode();返回对象的哈希码值
*
* 哈希值的特点：
*       默认情况下，不同对象的哈希值是不同的，但重写hasCode()方法可以让对象的哈希值相同
*       同一个对象多次调用hashCode()方法返回的哈希值是相同的*/
public class Set_hash {
    public static void main(String[] args) {
        Student s1 = new Student("liubo", 19);
        Student s2 = new Student("meiqiu", 20);
        Student s3 = new Student("gaohui", 19);
        //默认情况下，不同对象的哈希值是不同的，但重写hasCode()方法可以实现让对象的哈希值相同
        System.out.println(s1.hashCode());//2003749087
        System.out.println(s2.hashCode());//1324119927
        //同一个对象多次调用hashCode()方法返回的哈希值是相同的
        System.out.println(s3.hashCode());//990368553
        System.out.println(s3.hashCode());//990368553
        System.out.println("----------");

        System.out.println("hello".hashCode());//99162322
        System.out.println("world".hashCode());//113318802
        System.out.println("java".hashCode());//3254818
        System.out.println("world".hashCode());//113318802
        System.out.println("----------");

        System.out.println("刘博".hashCode());//672834
        System.out.println("煤球".hashCode());//929567
        //因为String类重写了hashCode()方法，所以会存在两个字符串哈希值相等的情况
        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
    }
}
