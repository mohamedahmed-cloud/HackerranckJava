/*
Problem Name :
Java Date and Time
Problem Link :
https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

*/

import java.util.Scanner;
import java.util.Calendar;

public class Problem0013 {
    public static void main(String[] args) {
        String[] Week_Day = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        int num = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(Week_Day[num - 1]);
    }
}
