package cn.itcast;

import java.util.ArrayList;

public class Tuozhan5 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("bca");
        list.add("dadfa");
        list.add("dddaaa");
        list.add("你好啊");
        list.add("我来啦，你干嘛呢");
        list.add("我来啦，你干嘛呢");
        list.add("别跑啊");

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length()>5){
                list.remove(i);
                i--;
            }
        }
        for (int i = 0; i < list.size(); i++) {

        }
        System.out.println(list);

    }
}
