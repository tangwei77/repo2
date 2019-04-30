package Demo02;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager=new Manager("群主",100);
        Member one=new Member("A",0);
        Member two=new Member("B",0);
        Member three=new Member("C",0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=========");

        ArrayList<Integer>list=manager.send(20,3);
        one.receive(list);
        two.receive(list);
        three.receive(list);

        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
