import java.util.Scanner;

public class TryRe {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        if(a==b)
            System.out.println("Yes");
        else
            System.out.println("No");
        if(a.equals(b)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
