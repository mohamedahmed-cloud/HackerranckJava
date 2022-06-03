/*
Problem Name :
    Java Int to String
Problem Link :
    https://www.hackerrank.com/challenges/java-int-to-string/problem?isFullScreen=true
 */
import java.util.Scanner;

public class problem0012 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        try{
            int number=scanner.nextInt();
            String myString=String.valueOf(number);
            System.out.println("Good job");

        }catch (Exception e){
            System.out.println("Wrong answer");
        }
    }
}
