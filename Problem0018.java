/*
Problem Name :
Java Strings Introduction
Problem Link :
https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
 */

import java.util.Locale;
import java.util.Scanner;

public class Problem0018 {
    public static void main(String[]args){
//            Input Operation
        Scanner scanner=new Scanner(System.in);
        String A=scanner.nextLine();
        String B=scanner.nextLine();
//        Output Operation
//        1
        int sum=A.length()+B.length();
        System.out.println(sum);
//        2
        if(A.compareTo(B)>1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
//        3

        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,A.length())+" "+B.substring(0,1).toUpperCase()+B.substring(1,B.length()));
    }
}
