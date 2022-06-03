/*
Problem Name :
Java Date and Time
Problem Link :
https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Problem0013 {
    public static void main(String[]args) {
        Date date=new Date();
        Calendar clander=Calendar.getInstance();
        clander.setTime(new Date());
        String dayWeekText = new SimpleDateFormat("EEEE").format(date);
        System.out.println(dayWeekText);


    }
}
