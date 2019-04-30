package Tuozhan4;

public class Test {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("王小平",20,"java");
        teacher.teach();

        Student student=new Student("李小乐",15,90);
        student.test();
    }
}
