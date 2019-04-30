

/*
public class kaoshi {
    public static void main(String[] args) {
        int a=55;
        int b=44;
        int c=33;
        int max=(a>b ? a:b);
        max=(max>c?max:c);
        int min=(a<b?a:b);
        min=(min<c?min:c);
        System.out.println("最大值"+max);
        System.out.println("最小值"+min);
    }
}
*/


/*
public class kaoshi {
    public static void main(String[] args) {
        for (int i =1 ; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
    }
}
*/


/*
public class kaoshi {
    public static void main(String[] args) {
        int a = 3;
        switch (3) {
            case 3:
                System.out.println("3月是春天");
                break;
            case 4:
                System.out.println("4月是春天");
                break;
            case 5:
                System.out.println("5月是春天");
                break;
            case 6:
                System.out.println("6月是夏天");
                break;
            case 7:
                System.out.println("7月是夏天");
                break;
            case 8:
                System.out.println("8月是夏天");
                break;
            case 9:
                System.out.println("9月是秋天");
                break;
            case 10:
                System.out.println("10月是秋天");
                break;
            case 11:
                System.out.println("11月是秋天");
                break;
            case 12:
                System.out.println("12月是冬天");
                break;
            case 1:
                System.out.println("1月是冬天");
                break;
            case 2:
                System.out.println("2月是冬天");
                break;
        }
    }
}*/


/*
public class kaoshi {
    public static void main(String[] args) {
        int[] arr={10,20,30};
        System.out.println("最大值："+sum(arr));
    }
    public static int sum(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }else{
                max=max;
            }
        }
        return max;
    }
}*/


/*
public class kaoshi {
    public static void main(String[] args) {
        count(1);
        count(2);
        count(4);
        count(5);
        count(7);
        count(8);
    }
    public static void count(int a) {
        int[] arr = {5, 4, 2, 1, 7, 5, 8, 7, 2};
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                num += 1;
            }
        }
        System.out.println(a+"出现了"+num+"次");
    }
}*/

public class kaoshi {
    public static void main(String[] args) {
        int[] arr={5,4,5,4,5,2,1,2};
        for (int i = 0; i < arr.length; i++) {
            int count=count(arr,arr[i]);
            System.out.println(arr[i]+"出现了"+count+"次");
        }
    }
    public static int count(int[] arr,int a){
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            if(a==arr[i]){
                num++;
            }
        }
        return num;
    }
}
