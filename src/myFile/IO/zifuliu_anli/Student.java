package myFile.IO.zifuliu_anli;

public class Student {
    private String bianhao;
    private String name;
    private int age;
    private String dizhi;

    public Student(){

    }

    public Student(String bianhao, String name, int age, String dizhi) {
        this.bianhao = bianhao;
        this.name = name;
        this.age = age;
        this.dizhi = dizhi;
    }

    public String getBianhao() {
        return bianhao;
    }

    public void setBianhao(String bianhao) {
        this.bianhao = bianhao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDizhi() {
        return dizhi;
    }

    public void setDizhi(String dizhi) {
        this.dizhi = dizhi;
    }
}
