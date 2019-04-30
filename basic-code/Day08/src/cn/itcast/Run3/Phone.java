package cn.itcast.Run3;

public class Phone {
    private String brand;
    private double price;

    public void call(String name){
        System.out.println("给"+name+"打电话");
    }

    public void sendMessage(){
        System.out.println("发短信");
    }

    public void playGame(){
        System.out.println("打英雄联盟");
    }

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
}
