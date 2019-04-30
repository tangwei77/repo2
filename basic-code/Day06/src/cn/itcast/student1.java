package cn.itcast;

public class student1 {
    public static void main(String[] args) {
        Student student=new Student(18,"张三");
        System.out.println(student.getAge()+" "+student.getName());
        student.Study();
        student.Eat();
    }
}
