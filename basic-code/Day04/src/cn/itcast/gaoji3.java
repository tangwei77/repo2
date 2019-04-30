package cn.itcast;

public class gaoji3 {
    public static void main(String[] args) {
        System.out.println("字符："+getChar(100));
        System.out.println("字符串："+getString(100));
    }
    public static char getChar(int num){
       char ch=(char)num;
       if(ch>'a' && ch<'z'){
           return ch;
       }else if(ch>'A' && ch<'Z'){
           return ch;
       }else if(ch>'0' && ch<'9'){
           return ch;
       }else{
           return ' ';
       }
    }
    public static String getString(int num) {
        String str="";
        char ch=(char) num;
        if(ch>'a' && ch<'z'){
            str+=ch;
        }else if(ch>'A' && ch<'Z'){
            str+=ch;
        }else if(ch>'0' && ch<'9'){
            str+=ch;
        }
        for (int i = 0; i < 2; i++) {
            str+=str;
        }
        return str;
    }
}
