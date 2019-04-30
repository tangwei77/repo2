package cn.itcast;

public class car1 {
    public static void main(String[] args) {
        Car car=new Car();
        car.setBland("宾利");
        car.setPrice(5000000.0);
        System.out.println(car.getBland());
        System.out.println(car.getPrice());
    }
}
