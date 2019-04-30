package Lianxi5;

public class Rectangle extends Shape {

    private double chang;
    private double kuan;

    public Rectangle(double chang, double kuan) {
        this.chang = chang;
        this.kuan = kuan;
    }

    @Override
    public void lengtch() {
        System.out.println("长方形周长："+(chang+kuan)*2);
    }

    @Override
    public void S() {
        System.out.println("长方形面积："+chang*kuan);
    }
}
