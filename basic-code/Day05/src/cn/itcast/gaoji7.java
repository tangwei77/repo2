package cn.itcast;

public class gaoji7 {
    public static void main(String[] args) {
        char[] arr={'a','l','f','m','f','o','b','b','s','n'};
        for (int i = 0; i < arr.length; i++) {
            int num=printCount(arr,arr[i]);
            System.out.println(arr[i]+"出现了"+num+"次");
        }
    }
    public static int printCount(char[] arr,char a){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(a==arr[i]){
                count++;
            }
        }
        return count;
    }
}
