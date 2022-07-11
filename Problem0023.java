/*
Problem Name :
Java Primality Test
Problem Link :
https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Problem0023 {
    public static void main(String[] args) {
//        Input Operation
        Scanner scanner = new Scanner(System.in);
        //        Solution That pass all
//        Output Operation
        BigInteger n = scanner.nextBigInteger();
        System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");

//        Output Operation
//        Easy Solution doesn't pass all test case

//        int out;
//        for(int i=2;i<num;i++){
//            if(num%i!=0){
//                out=0;
//            }
//            else{
//                out=1;
//                break;
//            }
//        }
//        if(out==0) System.out.println("prime");
//        else System.out.println("not prime");


    }
}

