package Demo02;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int leftMoney) {
        super(name, leftMoney);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        ArrayList<Integer>redList=new ArrayList<>();
        int leftMoney=super.getLeftMoney();
        if(totalMoney>leftMoney){
            System.out.println("余额不足");
            return redList;
        }

        super.setLeftMoney(leftMoney-totalMoney);
        int avg=totalMoney / count;
        int mod=totalMoney % count;
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        int last=avg+mod;
        redList.add(last);
        return redList;
    }
}
