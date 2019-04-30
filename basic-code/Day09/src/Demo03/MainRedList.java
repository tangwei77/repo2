package Demo03;

import java.util.ArrayList;

public class MainRedList {
    public static void main(String[] args) {
        Manager manager=new Manager("唐伟",100000000);
        Member one=new Member("王健林",10);
        Member two=new Member("马云",5);
        Member three=new Member("马化腾",3);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=================");

        ArrayList<Integer> list = manager.send(100000, 3);
        one.receive(list);
        two.receive(list);
        three.receive(list);

        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
