import java.math.BigInteger;
import java.util.Scanner;

/*
Problem Name :
Java BigInteger
Problem Link :
https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true

 */
public class Problem0024 {
    public static void main(String []args){
//        Input Operation
        Scanner scanner=new Scanner(System.in);
        BigInteger big1=scanner.nextBigInteger();
        BigInteger big2=scanner.nextBigInteger();
        BigInteger out1=big1.add(big2);
        BigInteger out2=big1.multiply(big2);
        System.out.println(out1);
        System.out.println(out2);


//        Output Operation


    }

}
