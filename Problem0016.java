/*
Problem Name :
Java Anagrams
problem Link :
https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
 */

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Problem0016 {
    public static void main (String []args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.next();
        String b=scanner.next();
        String [] arr1=a.split("");
        String [] arr2=b.split("");
        String[] arr3=new String[arr1.length];
        String[] arr4=new String[arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i].toLowerCase();
        }
        for(int i=0;i<arr2.length;i++){
            arr4[i]=arr2[i].toLowerCase();
        }
        Arrays.sort(arr3);
        Arrays.sort(arr4);
//        System.out.println(Arrays.toString(arr3));
//        System.out.println(Arrays.toString(arr2));
        int out=0;
        for(int i=0;i<arr3.length;i++){
            if(arr3.length!=arr4.length){
                System.out.println("Not Anagrams");
                break;
            }
            else if(arr3[i].equalsIgnoreCase(arr4[i])){
                out=1;
            }else {
                System.out.println("Not Anagrams");
                out=0;
                break;
            }
        }
        if(out==1){
            System.out.println("Anagrams");
        }
    }
}
