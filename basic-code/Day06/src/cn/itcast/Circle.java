package cn.itcast;

public class Circle {
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public void showArea(){
        System.out.println("半径为："+this.r+"，面积为："+3.14*this.r*this.r);
    }
    public void showPerimeter(){
        System.out.println("半径为："+this.r+"，周长为："+3.14*2*this.r);
    }
}
