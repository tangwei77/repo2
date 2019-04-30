package cn.itcast;

public class Tuozhan6 {
    public static void main(String[] args) {
        String str="ADBCD";
        char[] ch=str.toCharArray();
        char[] xc={'D','C','B','A','D'};
        char[] xz={'A','D','B','C','D'};
        char[] xb={'A','D','B','C','A'};
        char[] xk={'A','B','C','D','D'};

        grade("小传",xc);
        grade("小智",xz);
        grade("小播",xb);
        grade("小客",xk);

    }

    public static void grade(String name,char[] arr){
        char[] answer={'A','D','B','C','D'};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==answer[i]){
                count++;
            }
        }
        System.out.println("满分10分，"+name+":得分："+2*count+"分");
    }


}
