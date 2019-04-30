package Kaoshi;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] a = toArray(arr);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
    }

    public static int[] toArray(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(51) + 50;
            if (arr[i] % 2 != 0) {
                arr[i]++;
            }
        }
        return arr;
    }
}
