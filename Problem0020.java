import java.util.Arrays;
import java.util.Scanner;

/*
Problem Name :
Java Substring Comparisons
Problem Link :
https://www.hackerrank.com/challenges/java-string-compare/problem?h_r=next-challenge&h_r=next-challenge&h_v=zen&h_v=zen&isFullScreen=true
 */
public class Problem0020 {
    public static void main(String[]args){
//        Input Operation
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int num =scanner.nextInt();
//        Output Operation
        String[] arr=new String[str.length()+1-num];
        for(int i=0;i<arr.length;i++){
            arr[i]=str.substring(i,i+num);
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
    }
}
