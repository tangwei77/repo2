package Demo02;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int leftMoney) {
        super(name, leftMoney);
    }

    public void receive(ArrayList<Integer>list){
        int index=new Random().nextInt(list.size());
        int detal=list.remove(index);
        int money=super.getLeftMoney()+detal;
        super.setLeftMoney(money);
    }
}
