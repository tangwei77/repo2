package Gaoji6;

public class Employee {
    private String name;
    private String id;
    private String bumen;

    public Employee() {
    }

    public Employee(String name, String id, String bumen) {
        this.name = name;
        this.id = id;
        this.bumen = bumen;
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

    public String getBumen() {
        return bumen;
    }

    public void setBumen(String bumen) {
        this.bumen = bumen;
    }
}
