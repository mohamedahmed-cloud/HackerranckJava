import java.util.Scanner;

public class Problem0003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if (x % 2 == 0) {
            if (x >= 2 && x <= 5)
                System.out.println("Not Weird");
            else if (x >= 6 && x <= 20)
                System.out.println("Weird");
            else
                System.out.println("Not Weird");
        } else
            System.out.println("Weird");
    }
}
