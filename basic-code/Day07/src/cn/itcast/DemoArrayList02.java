package cn.itcast;

import java.util.ArrayList;

public class DemoArrayList02 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("def");
        list.add("hij");
        list.add("jkol");
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)=="def"){
                count++;
                list.remove(list.get(i));
            }
        }
        System.out.println("def字符串一共出现了"+count+"个");
        System.out.println(list);
    }
}
