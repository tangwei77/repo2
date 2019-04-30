package Demo04;

import java.util.ArrayList;

public class MainRedList {
    public static void main(String[] args) {
        Manager manager=new Manager("唐伟",1000000000);
        Member one=new Member("王健林",0);
        Member two=new Member("马云",0);
        Member three=new Member("马化腾",0);
        Member four=new Member("李彦宏",0);

        manager.show();
        one.show();
        two.show();
        three.show();
        four.show();
        System.out.println("=========");

        ArrayList<Integer> list = manager.send(10000, 3);
        one.receive(list);
        two.receive(list);
        three.receive(list);
        four.receive(list);

        manager.show();
        one.show();
        two.show();
        three.show();
        four.show();

    }


}
