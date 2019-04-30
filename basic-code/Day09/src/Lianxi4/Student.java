package Lianxi4;

public class Student extends Person {
    private double grade;

    public Student() {
    }

    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void test(){
        System.out.println(getName()+"同学"+",考试得了："+grade+"分");
    }
}
