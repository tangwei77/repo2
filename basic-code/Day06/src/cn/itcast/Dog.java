package cn.itcast;

public class Dog {
    private char color;
    private String bread;

    public Dog() {
    }

    public Dog(char color, String bread) {
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
        System.out.println(this.color+"色的"+this.bread+"正在啃骨头");
    }
    public void catchMouse(){
        System.out.println(this.color+"色的"+this.bread+"正在看家");
    }
}
