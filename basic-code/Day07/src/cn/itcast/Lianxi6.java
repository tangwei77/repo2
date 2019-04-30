package cn.itcast;

import java.util.ArrayList;
import java.util.Random;

public class Lianxi6 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 50; i++) {
            int a = r.nextInt(100) + 1;
            list.add(a);
        }
        System.out.println(getSmallList(list));
        System.out.println(getSmallList(list).size());
    }
    public static ArrayList getSmallList(ArrayList<Integer> list){
        ArrayList<Integer> smallList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0){
                smallList.add(list.get(i));
            }
        }
        return smallList;
    }
}
