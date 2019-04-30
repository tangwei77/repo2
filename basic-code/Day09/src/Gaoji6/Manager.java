package Gaoji6;

public class Manager extends Employee{

    private String clerk;

    public Manager(String clerk) {
        this.clerk = clerk;
    }

    public Manager(String name, String id, String bumen, String clerk) {
        super(name, id, bumen);
        this.clerk = clerk;
    }

    public String getWorker() {
        return clerk;
    }

    public void setWorker(String worker) {
        this.clerk = worker;
    }

    public void manager(){
        System.out.println(super.getBumen()+"的："+super.getName()+"，员工编号:"+super.getId());
        System.out.println("他的职员是"+clerk);
    }
}
