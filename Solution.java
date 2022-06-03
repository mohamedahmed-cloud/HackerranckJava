import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution<H, B> {
    static boolean flag=true;
    static Scanner scan=new Scanner(System.in);
    static int B=scan.nextInt();
    static int H=scan.nextInt();
    if(B>=0){
        flag=true;
    }
    else{
        flag=false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }


    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

