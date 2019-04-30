package Kaoshi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random r=new Random();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int a = r.nextInt(51)+50;
            list.add(a);
        }
        System.out.println(toArray(list));
    }

    public static ArrayList<Integer> toArray(ArrayList<Integer> list){
        ArrayList<Integer>list1=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int a=list.get(i);
            if(a % 2 != 0){
                a++;
            }
            list1.add(a);
        }
        return list1;
    }
}
