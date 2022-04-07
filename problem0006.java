import java.util.Scanner;

public class problem0006 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String a=input.next();
        int x=input.nextInt();
        String b=input.next();
        int y=input.nextInt();
        String c=input.next();
        int z=input.nextInt();
        System.out.println("================================");
        System.out.printf("%-15s",a);
        System.out.printf("%03d",x);
        System.out.println("");
//        Second
        System.out.printf("%-15s",b);
        System.out.printf("%03d",y);
        System.out.println("");
//        Thrid
        System.out.printf("%-15s",c);
        System.out.printf("%03d",z);
        System.out.println("");

        System.out.println("================================");




    }
}
/*
Input :

java 100
cpp 65
python 50

Output :

================================
java           100
cpp            065
python         050
================================
 */
