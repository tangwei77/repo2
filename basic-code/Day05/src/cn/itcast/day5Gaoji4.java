package cn.itcast;

public class day5Gaoji4 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,3,2,1};
        int[] arr2={1,2,3,4,3,2,1};
        System.out.println("是否一致:"+equals(arr1,arr2));
    }
    public static boolean equals(int[] a,int[] b){
        if(a.length!=b.length){
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
