package Lianxi6;

public class Clerk extends Employee {
    private Manager manager;

    public Clerk() {
    }

    public Clerk(String name, String id, String depar) {
        super(name, id, depar);
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void clerk(){
        super.show();
        System.out.println("他的经理是"+manager.getName());
    }
}
