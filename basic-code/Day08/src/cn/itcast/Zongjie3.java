package cn.itcast;

import java.util.Arrays;

public class Zongjie3 {
    public static void main(String[] args) {
        int[] arr={10,20,30,50,40};
        String string = arr.toString();
        System.out.println(string);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
