package cn.itcast;

public class Card {
    private String color;
    private char dianshu;

    public Card(String color, char dianshu) {
        this.color = color;
        this.dianshu = dianshu;
    }

    public void showCard(){
        System.out.println(color+dianshu);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDianshu() {
        return dianshu;
    }

    public void setDianshu(char dianshu) {
        this.dianshu = dianshu;
    }
}
