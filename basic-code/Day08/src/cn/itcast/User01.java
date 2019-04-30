package cn.itcast;

import java.util.ArrayList;

public class User01 {
    User01 use = new User01();
    private String name;
    private String password;

    public User01() {
    }

    public User01(User01 use, String name, String password) {
        this.use = use;
        this.name = name;
        this.password = password;
    }

    public User01 getUse() {
        return use;
    }

    public void setUse(User01 use) {
        this.use = use;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void show(){
        System.out.println(name+"-"+password);
    }
}
