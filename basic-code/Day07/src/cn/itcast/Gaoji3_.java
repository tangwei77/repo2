package cn.itcast;

import java.util.ArrayList;
import java.util.Scanner;

public class Gaoji3_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> list=new ArrayList<>();
        while(true){
            Student student=new Student();
            System.out.println("1.录入信息 0.退出");
            int i=sc.nextInt();
            switch(i){
                case 1:
                    System.out.println("请输入姓名");
                    String name=sc.next();
                    student.setName(name);
                    System.out.println("请输入年龄");
                    int age=sc.nextInt();
                    student.setAge(age);
                    list.add(student);
                    break;
                case 0:
                    System.out.println("录入完毕");
            }
            if(i==0){
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            Student student=list.get(i);
            student.show();
        }
    }
}
