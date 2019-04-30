package cn.itcast;

public class gaoji3 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,3,2,1};
        int[] arr2={1,2,3,4,5,2,1};
        System.out.println("[1,2,3,4,3,2,1]是否对称："+method(arr1));
        System.out.println("[1,2,3,4,5,2,1]是否对称："+method(arr2));
    }
    public static boolean method(int[] arr){
        int start;
        int end;
        for ( start=0,end= arr.length-1; start<end; start++,end--) {
            if(arr[start]!=arr[end]){
                return false;
            }
        }
        return true;
    }
}
