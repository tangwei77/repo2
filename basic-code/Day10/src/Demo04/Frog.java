package Demo04;

public class Frog extends Animal implements Swim {

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("青蛙会蛙泳");
    }
}
