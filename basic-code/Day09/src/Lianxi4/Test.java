package Lianxi4;

public class Test {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("唐伟",35,"java");
        teacher.teach();

        Student student=new Student("李小乐",20,90);
        student.test();
    }
}
