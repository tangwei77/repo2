package cn.itcast;

public class Book {
    private String num;
    private String name;
    private String bianma;
    private double price;
    private String date;

    public Book() {
    }

    public Book(String num, String name, String bianma, double price, String date) {
        this.num = num;
        this.name = name;
        this.bianma = bianma;
        this.price = price;
        this.date = date;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBianma() {
        return bianma;
    }

    public void setBianma(String bianma) {
        this.bianma = bianma;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void showBook(){
        System.out.println("最贵的书是："+this.num+","+this.name+","+this.bianma+","+this.price+","+this.date);
    }
}
