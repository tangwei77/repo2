package Gaoji3;

public interface A {
    void showA();

    private void show10(String str){
        for (int i = 0; i < 10; i++) {
            System.out.print(str+"\t");
        }
        System.out.println();
    }

    public default void showB10(String str){
        common(str);
    }

    public default void showC10(String str){
        common(str);
    }

    private void common(String str){
        show10(str);
    }
}
