package cn.itcast;

public class day05zuoye02 {
    public static void main(String[] args) {
       int[] arr={10,20,30,};
        for(int min=0,max=arr.length-1;min<max;min++,max--){
            int temp;
            temp=arr[min];
            arr[min]=arr[max];
            arr[max]=temp;
         }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
