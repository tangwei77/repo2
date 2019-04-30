package Demo04;

public class Test {
    public static void main(String[] args) {
        Breeder breeder=new Breeder();
        Animal dog=new Dog();
        breeder.feed(dog);
        Dog d=(Dog) dog;
        d.swim();
        System.out.println();

        Animal frog=new Frog();
        breeder.feed(frog);
        Frog f=(Frog) frog;
        f.swim();
        System.out.println();

        Animal goat=new Goat();
        breeder.feed(goat);
        System.out.println();

    }
}
