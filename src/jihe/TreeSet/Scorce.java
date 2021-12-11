package jihe.TreeSet;

public class Scorce {
    private String name;
    private int Chinese;
    private int math;

    public Scorce(){

    }

    public Scorce(String name, int chinese, int math) {
        this.name = name;
        Chinese = chinese;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
}
