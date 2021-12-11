package myFile.IO.zifuliu_anli;

public class Score {
    private String name;
    private double Chinese;
    private double Math;
    private double English;

    public Score(){

    }

    public Score(String name, double chinese, double math, double english) {
        this.name = name;
        Chinese = chinese;
        Math = math;
        English = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChinese() {
        return Chinese;
    }

    public void setChinese(double chinese) {
        Chinese = chinese;
    }

    public double getMath() {
        return Math;
    }

    public void setMath(double math) {
        Math = math;
    }

    public double getEnglish() {
        return English;
    }

    public void setEnglish(double english) {
        English = english;
    }

    public double get(){
        return English + Math + Chinese;
    }
}
