package Demo07;

public class Person {
    private String name;
    private int age;


    public void keepPet(Dog dog,String something){
        System.out.println("喂宠物"+dog.getBrand()+"吃"+something);
    }


    public void keepPet(Cat cat,String something){
        System.out.println("喂宠物"+cat.getBrand()+"吃"+something);
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
