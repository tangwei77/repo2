package cn.itcast;

public class day5Gaoji3 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,3,2,1};
        int[] arr2={1,2,3,4,5,2,1};
        System.out.println("[1,2,3,4,3,2,1]是否对称:"+isSame(arr1));
        System.out.println("[1,2,3,4,5,2,1]是否对称:"+isSame(arr2));

    }
    public static boolean isSame(int[] arr){
        for (int start = 0,end=arr.length-1; start < end; start++,end--) {
            if(arr[start]!=arr[end]){
                return false;
            }
        }
        return true;
    }
}
