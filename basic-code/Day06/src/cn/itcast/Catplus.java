package cn.itcast;

public class Catplus {
    private char color;
    private String bread;

    public Catplus() {
    }

    public Catplus(char color, String bread) {
        this.color = color;
        this.bread = bread;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }
    public void eat(){
        System.out.println(this.color+"色的"+this.bread+"正在吃鱼");
    }
    public void catchMouse(){
        System.out.println(this.color+"色的"+this.bread+"正在逮老鼠");
    }
}
