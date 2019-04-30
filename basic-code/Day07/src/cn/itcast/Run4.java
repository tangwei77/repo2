package cn.itcast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Run4 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 50; i++) {
            list.add(r.nextInt(100)+1);
        }
        ArrayList smallList = getSmallList(list);
        System.out.println(smallList);
    }

    public static ArrayList getSmallList(ArrayList<Integer> list){
        ArrayList<Integer>smallList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
           if(list.get(i) % 2 ==0){
               smallList.add(list.get(i));
           }
        }
        return smallList;
    }
}
