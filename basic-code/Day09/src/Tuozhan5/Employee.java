package Tuozhan5;

public class Employee {
    private String name;
    private String id;
    private String branch;

    public Employee() {
    }

    public Employee(String name, String id, String branch) {
        this.name = name;
        this.id = id;
        this.branch = branch;
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void show(){
        System.out.println(branch+"的："+name+",员工编号："+id);
    }
}
