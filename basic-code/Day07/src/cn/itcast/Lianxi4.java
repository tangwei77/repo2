package cn.itcast;

import java.util.ArrayList;

public class Lianxi4 {
    public static void main(String[] args) {
        ArrayList<Person> list=new ArrayList<>();
        Person one=new Person("张飞",50);
        Person two=new Person("曹操",55);
        list.add(one);
        list.add(two);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名为:"+list.get(i).getName()+",年龄为："+list.get(i).getAge());
        }
    }
}
