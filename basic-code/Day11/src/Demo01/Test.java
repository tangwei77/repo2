package Demo01;

public class Test {
    public static void main(String[] args) {
        InterFace inter = new InterFace() {
            @Override
            public void show() {
                System.out.println("今天又是充满希望的一天");
            }
        };
        inter.show();
    }
}
