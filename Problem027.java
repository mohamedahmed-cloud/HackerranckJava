/*
Problem Name : Java Inheritance II
Problem Link : https://www.hackerrank.com/challenges/java-inheritance-2/problem?isFullScreen=true
 */

public class Problem027 {
    public static void main(String[] args) {
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}

class Arithmetic {
    int a;
    int b;
    Arithmetic(int a ,int b){
        this.a=a;
        this.b=b;
    }
    Arithmetic(){

    }
    int add(int c, int d){
        return  c+d;

    }

}
class Adder extends Arithmetic {


}
