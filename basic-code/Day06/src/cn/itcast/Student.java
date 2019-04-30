package cn.itcast;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(int age,String name) {
        this.name = name;
        this.age = age;
    }

    public void Study(){
        System.out.println("正在努力的写作业");
    }
    public void Eat(){
        System.out.println("写完作业要吃饭了");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

