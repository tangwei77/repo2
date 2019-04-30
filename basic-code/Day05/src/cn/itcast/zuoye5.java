package cn.itcast;

public class zuoye5 {
    public static void main(String[] args) {
        String[] huase={"黑桃","红桃","梅花","方块"};
        String[] dianshu={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] puke=printcard(huase,dianshu);
        for(int i=0;i<puke.length;i++){
            System.out.print(puke[i]+" ");
            }
        }
    public static String[] printcard(String[] huase,String[] dianshu){
        String[] puke=new String[huase.length*dianshu.length];
        int count=0;
        for (int i = 0; i < huase.length; i++) {
            for (int j = 0; j < dianshu.length; j++) {
                puke[count++]=huase[i]+dianshu[j];
            }
        }
        return puke;
    }
}

