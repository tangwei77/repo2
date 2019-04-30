package Lianxi5;

public class Circle extends Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void lengtch() {
        System.out.println("圆形周长："+2*Math.PI*r);
    }

    @Override
    public void S() {
        System.out.println("圆形面积："+Math.PI*r*r);
    }
}
