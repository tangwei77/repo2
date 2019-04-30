package cn.itcast;

public class MyDate {
    int year;
    int month;
    int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void showDate(){
        System.out.println(this.year+"年"+this.month+"月"+this.day+"日");
    }
    public void isBi(){
        if(year%100==0){
            System.out.println(this.year+"年是世纪年");
        }else{
            System.out.println(this.year+"年不是世纪年");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }


}
