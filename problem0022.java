/*
problem Name :
Pattern Syntax Checker
Problem Link :
https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class problem0022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < num; i++) {
            String str = scanner.nextLine();
            try {
                Pattern p = Pattern.compile(str);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }


        }
    }

}


