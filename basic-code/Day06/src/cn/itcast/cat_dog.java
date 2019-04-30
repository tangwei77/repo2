package cn.itcast;

public class cat_dog {
    public static void main(String[] args) {
       /* Catplus cat=new Catplus('花',"波斯猫");
        Dog dog=new Dog('黑',"藏獒");
        cat.eat();
        cat.catchMouse();
        dog.eat();
        dog.catchMouse();*/

        Catplus cat=new Catplus();
        Dog dog=new Dog();
        cat.setColor('花');
        cat.setBread("波斯猫");
        dog.setColor('黑');
        dog.setBread("藏獒");
        cat.eat();
        cat.catchMouse();
        dog.eat();
        dog.catchMouse();
    }
}
