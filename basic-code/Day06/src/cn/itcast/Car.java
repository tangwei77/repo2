package cn.itcast;

public class Car {
    private String bland;
    private String color;
    private double price;


    public  void setPrice(double price) {
        if(price>0){
            this.price=price;
        }else{
            System.out.println("数据不合理");
        }
    }
    public double getPrice(){
        return price;
    }



    public void setBland(String bland){
        this.bland=bland;
    }
    public String getBland(){
        return bland;
    }
}
