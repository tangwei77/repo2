package Demo05;

public class Student extends Person {
    private String school;
    private int stuNumber;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    @Override
    public void work(){
        System.out.println("学生需要学习");
    }
}


