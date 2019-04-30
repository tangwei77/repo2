package cn.itcast;

public class zuoye4 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,3,2,1};
        int[] arr2={1,2,3,4,3,2,1};
        System.out.println("是否一致:"+equals(arr1,arr2));
    }
    public static boolean equals(int[] arr1,int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        if(arr1.length!=arr2.length){
            return false;
        }
        return true;
    }
}
