package Demo07;

public class Test {
    public static void main(String[] args) {
       Dog dog=new Dog(5,"黑色");
       dog.setBrand("哈士奇");
       dog.eat("骨头");
       dog.lookHome();
       Person person=new Person();
       person.keepPet(dog,"骨头");
       System.out.println("===================");


       Cat cat=new Cat(3,"白色");
       cat.setBrand("加菲猫");
       cat.eat("鱼");
       cat.catchMouse();
        person.keepPet(cat,"鱼");

    }
}
