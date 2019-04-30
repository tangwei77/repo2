package Gaoji4;

public interface A {
    void showA();

    private static void show10(String str){
        for (int i = 0; i < 10; i++) {
            System.out.print(str);
        }
        System.out.println();
    }

    static void shoeB10(String str){
        System.out.println("static " +str);
        show10(str+"\t");
    }

    static void shoeC10(String str){
        System.out.println("static " +str);
        show10(str+"\t");
    }
}
