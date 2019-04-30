package Animal;

import Gaoji2.A;

public class Cat extends Animal {
    @Override
    public void eat(String something) {
        System.out.println("猫吃"+something);
    }

    public void catchMouse(){
        System.out.println("逮老鼠");
    }

    public Cat() {
    }

    public Cat(int age, String colorl) {
        super(age, colorl);
    }
}
