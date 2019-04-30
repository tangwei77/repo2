package cn.itcast;

public class zuoye3 {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,3,2,1};
        int[] arr2 = {1,2,3,4,5,2,1};
        System.out.println(sym(arr1));
        System.out.println(sym(arr2));
    }
    public static boolean sym(int[] arr) {
        int min;
        int max;
        for ( min = 0, max = arr.length - 1; min < max; min++, max--) {
            if (arr[min] != arr[max]) {
                return false;
             }
        }
        return true;
    }
}
