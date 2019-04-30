package Gaoji6_;

public class Clerk extends Employee {

    Manager m;

    public Clerk() {
    }

    public Clerk(String name, String id, String bumen) {
        super(name, id, bumen);
    }

    public Manager getM() {
        return m;
    }

    public void setM(Manager m) {
        this.m = m;
    }

    public void manager(){
        super.showMsg();
        System.out.println("他的经理是"+m.getName());
    }
}
