package cn.itcast;

import java.util.Arrays;

public class Tuozhan4 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,3,2,1};
        int[] arr2={1,2,3,4,3,2,1};
        boolean same = isSame(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("是否一致："+same);
    }
    public static boolean isSame(int[] arr1,int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=arr2[i]){
                return false;
            }else if(arr1.length!=arr2.length){
                return false;
            }
        }
        return true;
    }
}
