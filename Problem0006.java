import java.util.Scanner;

//Name is Java Loops I
//Link is " https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true  "
public class Problem0006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        multipleTable(number);

    }

    public static void multipleTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + i * num);
        }
    }
}
