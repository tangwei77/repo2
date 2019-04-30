package cn.itcast;

import java.util.ArrayList;
import java.util.Random;

public class Zuoye6 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 50; i++) {
            int a=r.nextInt(100)+1;
            list.add(a);
        }
        ArrayList<Integer> a=getSmallList(list);
        System.out.println(a);
    }
    public static ArrayList getSmallList(ArrayList<Integer> list){
        ArrayList<Integer> samllList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0){
                samllList.add(list.get(i));
            }
        }
        return samllList;
    }
}
