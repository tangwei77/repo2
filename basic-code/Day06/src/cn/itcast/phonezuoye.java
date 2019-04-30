package cn.itcast;

public class phonezuoye {
    public static void main(String[] args) {
        /*Phone phone = new Phone();
        phone.setBrand("小米");
        phone.setPrice(998);
        phone.call();
        phone.sendessage();
        phone.playGame();*/

        Phone phone = new Phone("小米", 998);
        phone.call();
        phone.sendessage();
        phone.playGame();
    }

}
