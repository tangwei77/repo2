package cn.itcast;

import javafx.scene.transform.Scale;

import java.util.ArrayList;
import java.util.Scanner;

public class Gaoji3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        while(true){
            System.out.println("1，录入信息 0.退出");
            Student student=new Student();
            int i=sc.nextInt();
            if(i==1){
                System.out.println("请输入姓名：");
                String name=sc.next();
                student.setName(name);
                System.out.println("请输入年龄：");
                int age=sc.nextInt();
                student.setAge(age);
                list.add(student);
            }else if(i==0){
                System.out.println("录入完毕");
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
           Student student=list.get(i);
            student.show();
        }
    }
}
