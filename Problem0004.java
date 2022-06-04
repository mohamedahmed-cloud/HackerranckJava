import java.util.Scanner;

public class Problem0004 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        double y=input.nextDouble();
        input.nextLine(); //Important to break the line of input form the last nextDouble()
        String z= input.nextLine();
        input.close();
        System.out.println("String: "+ z);
        System.out.println("Double: "+y);
        System.out.println("Int: "+x);
    }
}
//Note That=>Next& NextLine is difference
/*
Input:

42
3.1415
Welcome to HackerRank's Java tutorials!

Output :
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
 */
