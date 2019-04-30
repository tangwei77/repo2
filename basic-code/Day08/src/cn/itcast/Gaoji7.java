package cn.itcast;

import java.util.ArrayList;
import java.util.Scanner;

public class Gaoji7 {
   static ArrayList<User>list=new ArrayList<>();
   static {
       list.add(new User("jack","1234"));
       list.add(new User("rose","5678"));
       list.add(new User("tom","0000"));
       for (int i = 0; i < list.size(); i++) {
           list.get(i).show();
       }
   }
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("请输入用户名");
       String name = sc.next();
       System.out.println("请输入密码");
       String mima = sc.next();
       User user = new User(name, mima);
       String login=login(user);
       System.out.println("登录结果："+login);
   }
        public static String login(User user){
       String msg="";
       String n=user.getName();
       String p=user.getMima();
            for (int i = 0; i < list.size(); i++) {
                User u=list.get(i);
                String name=u.getName();
                String mima=u.getMima();
                if(name.equals(n)){
                    if(mima.equals(p)){
                        return "登陆成功";
                    }else{
                        return "密码错误";
                    }
                }else{
                    msg="用户名不存在";
                    continue;
                }
            }
            return msg;
        }

}
