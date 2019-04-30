package cn.itcast.Demo01;

import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int a = r.nextInt(46) + 5;
            arr[i] = a;
        }
        int[] newArray = getNewArray(arr);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    private static int[] getNewArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<10){
                arr[i]=0;
            }
        }
        return arr;

    }
}