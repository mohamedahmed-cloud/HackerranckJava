/*
Problem Name :
Java Currency Formatter
Problem Link :
https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true
 */

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Problem0014 {
    public  static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        double input=scanner.nextDouble();
        Locale IndiaLocal=new Locale("in", "in");
        NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat in=NumberFormat.getCurrencyInstance(IndiaLocal);
        NumberFormat ch=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fr=NumberFormat.getCurrencyInstance(Locale.FRANCE);
//        Printing
        System.out.println("US: " +us.format(input));
        System.out.println("India: " +in.format(input));
        System.out.println("China: " +ch.format(input));
        System.out.println("France: " +fr.format(input));

    }
}
