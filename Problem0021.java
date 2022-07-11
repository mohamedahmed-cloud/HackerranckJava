import java.util.Arrays;
import java.util.Scanner;

/*
Problem Name :
Java String Tokens
problem Link :
https://www.hackerrank.com/challenges/java-string-tokens/problem?h_r=next-challenge&h_r=next-challenge&h_r=next-challenge&h_v=zen&h_v=zen&h_v=zen&isFullScreen=true
 */
public class Problem0021 {
    public static void main(String[] args) {
//        Input Operation
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = {"!", ",", "?", ".", "_", "'", "@"};
        String str2;
//        Output Operation
        for (int i = 0; i < str.length(); i++) {
            for (String s : arr)
                if (str.substring(i, i + 1).equals(s)) {
                    str2 = str.replace(s, " ");
                    str = str2;
                }
        }
        str.trim();
        String[] arr2 = str.split(" ");
        int sum = 0;
        for (String s : arr2) {
            if (s.isEmpty()) {
                continue;
            } else
                sum += 1;
        }
        System.out.println(sum);
//        System.out.println(Arrays.toString(arr2));
        for (String s : arr2) {
            if (s.isEmpty()) {
                continue;
            } else {
                System.out.println(s);
            }
        }

    }
}
