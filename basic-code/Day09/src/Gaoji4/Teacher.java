package Gaoji4;

public class Teacher extends Person {
    private String xueke;

    public Teacher() {

    }


    public Teacher(String name, String xueke) {
        super(name);
        this.xueke = xueke;
    }

    public String getXueke() {
        return xueke;
    }

    public void setXueke(String xueke) {
        this.xueke = xueke;
    }

    public void showTeach(){
        System.out.println(getName()+"老师"+",讲授"+xueke);
    }
}
