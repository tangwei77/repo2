package cn.itcast;

public class Cat {
    int age;
    char color;

    public Cat() {
    }

    public Cat(int age, char color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public void showMsg(){
        System.out.println("猫的年龄："+this.age+"，颜色:"+this.color);
    }

    public void isSame(int age1,int age2,char color1,char color2){
        if(age1==age2 && color1==color2){
            System.out.println("属性相同？"+true);
        }else{
            System.out.println("属性相同？"+false);
        }
    }
}
