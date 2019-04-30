package cn.itcast;

public class User {
    private String name;
    private String mima;

    public User() {
    }

    public User(String name, String mima) {
        this.name = name;
        this.mima = mima;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMima() {
        return mima;
    }

    public void setMima(String mima) {
        this.mima = mima;
    }

    public void show(){
        System.out.println(name+"-"+mima);
    }
}
