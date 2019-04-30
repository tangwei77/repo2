package cn.itcast;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoArrayList {
    public static void main(String[] args) {
       ArrayList<String> list=new ArrayList<>();
       Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(sc.next());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
