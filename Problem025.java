import java.util.Scanner;

/*
problem Name :
https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true
Problem Link :
Java 1D Array
 */
public class Problem025 {
    public static void main(String[] args) {
//        Input Operation
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
//        Output Operation
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }
}
