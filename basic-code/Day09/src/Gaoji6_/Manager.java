package Gaoji6_;


public class Manager extends Employee{
     Clerk c;

    public Manager() {
    }

    public Manager(String name, String id, String bumen) {
        super(name, id, bumen);
    }

    public Clerk getC() {
        return c;
    }

    public void setC(Clerk c) {
        this.c = c;
    }

    public void clerk(){
        super.showMsg();
        System.out.println("他的职员是"+c.getName());
    }
}
