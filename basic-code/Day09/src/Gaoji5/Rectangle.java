package Gaoji5;

public  class Rectangle extends Shape {
    private double chang;
    private double kuan;

    public Rectangle(double chang, double kuan) {
        this.chang = chang;
        this.kuan = kuan;
    }

    @Override
    public void length() {
        double length=(chang+kuan)*2;
        System.out.println("长方形周长："+length);
    }

    @Override
    public void mianji() {
        double S=chang*kuan;
        System.out.println("长方形面积:"+S);
    }
}
