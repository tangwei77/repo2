package cn.itcast;

public class Phone {
    private String brand;
    private double price;
    static int size;

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        Phone.size = size;
    }

    public void call(String name) {
        System.out.println("给"+name+"打电话");
    }

    public void sendMessage() {
        System.out.println("发短信");
    }
}
