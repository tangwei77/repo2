package cn.itcast;

import java.util.ArrayList;

public class Gaoji5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("原字符串：");
        arrayList(list);
    }
    public static void arrayList(ArrayList<String> list){
        list.add("bca");
        list.add("dadfa");
        list.add("dddaaa");
        list.add("你好啊");
        list.add("我来啦,你干嘛呢" );
        list.add("我是你爸爸,你干嘛呢" );
        list.add("别跑啊");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length()>5){
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println("删除后");
        System.out.println(list);
    }
}
