package Lianxi3;

public abstract class Poultry {
    private String name;
    private String symptom;
    private int age;
    private String liiness;

    public Poultry() {
    }

    public Poultry(String name, String symptom, int age, String liiness) {
        this.name = name;
        this.symptom = symptom;
        this.age = age;
        this.liiness = liiness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLiiness() {
        return liiness;
    }

    public void setLiiness(String liiness) {
        this.liiness = liiness;
    }

    public abstract void showSymptom();

    public void showMsg(){
        System.out.println("动物种类："+this.name+",年龄："+this.age+"岁");
        System.out.println("入院原因："+this.liiness);
    }
}
