package cn.itcast;

/*public class Demo1 {
    public static void main(String[] args) {
     *//*  // int[] arrayA={10,20,30};
       // int[] arrayA= new int[]{10};
        int[] arrayB=new int[10];
        System.out.println(arrayB.length);*//*

       *//* int[] arrayA={10,20,30,40};
        System.out.println(arrayA[1]);*//*
       // int[] arrayA=new int[5];
        // System.out.println(arrayA.length);
        int[] arr={10,20,30};
        System.out.println(arr[1]);
        arr[1]=200;
        System.out.println(arr[1]);
    }
}*/

public class Demo1 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        for (int i = 0; i < 4; i++) {
            if(arr[i]<20){
                continue;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        arr[1]=500;
        System.out.println(arr[1]);
    }
}

