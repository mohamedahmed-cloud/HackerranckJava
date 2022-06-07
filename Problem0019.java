import java.util.Scanner;

/*
Problem Name :
Java Substring
Problem Link :
https://www.hackerrank.com/challenges/java-substring/problem?h_r=next-challenge&h_v=zen&isFullScreen=true

 */
public class Problem0019 {
    public static void main(String[]args){
//        Input operation
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
//        Output Operation
        System.out.println(str.substring(num1,num2));
    }
}
