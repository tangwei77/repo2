package Demo01;

import java.util.ArrayList;

public class Manager extends User{
    public Manager(){
    }

    public Manager(String name, int leftMoney) {
        super(name, leftMoney);
    }

    public ArrayList<Integer> send(int totalMoney,int count ){
        // 需要一个集合，用来存储若干个红包的余额
        ArrayList<Integer> redlist=new ArrayList<>();

        // 首先看一下群主有多少钱
        int leftMoney=super.getLeftMoney(); //群主当前余额
        if(totalMoney>leftMoney){
            System.out.println("余额不足");
            return redlist; // 返回空集合
        }

        // 扣钱，重新设置余额
        super.setLeftMoney(leftMoney-totalMoney);

        // 发红包需要平均分成count份
        int avg=totalMoney / count;
        int mod=totalMoney % count; //余数，剩下的零头
        // 剩下的零头，包在最后一个红包当中
        // 下面把红包一个个放到集合中
        for (int i = 0; i < count-1; i++) {
            redlist.add(avg);
        }
        // 最后一个红包
        int last = avg + mod;
        redlist.add(last);

        return redlist;
    }

}
