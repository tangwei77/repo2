package Lianxi6;

public class Employee {
    private String name;
    private String id;
    private String depar;

    public Employee() {
    }

    public Employee(String name, String id, String depar) {
        this.name = name;
        this.id = id;
        this.depar = depar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepar() {
        return depar;
    }

    public void setDepar(String depar) {
        this.depar = depar;
    }

    public void show(){
        System.out.println(depar+"的:"+name+"，员工编号："+id);
    }
}
