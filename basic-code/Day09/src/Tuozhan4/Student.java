package Tuozhan4;

public class Student extends Person {

    private int grade;

    public Student() {
    }

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void test(){
        System.out.println(getName()+"同学"+"，考试得了："+grade+"分");
    }


}
