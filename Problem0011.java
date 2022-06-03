/*
Problem Name:
 Java Static Initializer Block
Problem Link:
 https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true

 */


import java.util.*;


public class Problem0011 {
        static int B;
        static int H;
        static boolean flag=false;
        static {
            Scanner scanner=new Scanner(System.in);
            B=scanner.nextInt();
            H=scanner.nextInt();
            try{
                if(B>0&&H>0){
                    flag=true;
                }else {
                    flag=false;
                    System.out.println("java.lang.Exception: Breadth and height must be positive");
                }

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }


    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

