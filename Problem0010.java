/*
Problem Name :
 Java End-of-file
problem Link :
 https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true

 */
import java.util.Scanner;

public class Problem0010 {
    public static void main(String[]args){
        Scanner read=new Scanner(System.in);
        int i=1;
        while(read.hasNext()){
            String str=read.nextLine();
            System.out.println(i+" "+str);
            i+=1;

        }

    }

}
