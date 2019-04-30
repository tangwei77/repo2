package Animal;

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog(2,"黄色");
        Cat cat=new Cat();
        dog.eat("骨头");
        dog.lookHome();
        cat.eat("鱼");
        cat.catchMouse();

        Person person=new Person();
        person.keepPet(dog,"屎");
    }
}
