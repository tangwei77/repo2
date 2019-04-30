package Gaoji5;

public  class Circle extends Shape {


    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void length() {
        double length=2*Math.PI*r;
        System.out.println("圆形周长:"+length);
    }

    @Override
    public void mianji() {
        double s=Math.PI*r*r;
        System.out.println("圆形面积:"+s);
    }
}
