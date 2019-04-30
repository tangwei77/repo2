package Gaoji4;

public class Student extends Person {
    private int grade;

    public Student() {
    }


    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void Test(){
        System.out.println(getName()+"同学"+",考试得了："+this.grade+"分");
    }
}
