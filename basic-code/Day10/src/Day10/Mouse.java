package Day10;

public class Mouse implements USB {
    @Override
    public void powerOn() {
        System.out.println("连接鼠标的USB");
    }

    @Override
    public void powerOff() {
        System.out.println("断开鼠标的USB");
    }
}
