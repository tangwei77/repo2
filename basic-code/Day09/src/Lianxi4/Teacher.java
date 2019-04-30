package Lianxi4;

public class Teacher extends Person {
    private String course;

    public Teacher() {
    }

    public Teacher(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void teach(){
        System.out.println(getName()+"老师"+",讲授"+course+"课");
    }
}
