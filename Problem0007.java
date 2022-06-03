import java.util.Scanner;
//Name is Java Loops II
//Link is " https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true&h_r=next-challenge&h_v=zen "
public class Problem0007 {
    public static void main (String []args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int [][] Array=new int[num][3];
        for(int i=0;i<num;i++) {
            for(int j=0; j<3;j++){
                Array[i][j]=input.nextInt();
            }
        }
//        System.out.println(Arrays.deepToString(Array));
        for(int i=0;i<num;i++){
            int a=Array[i][0];
            int b= Array[i][1];
            int n=Array[i][2];
            double previous=0;
            double out=0;
            double store=0;
            for(int j=0; j<n;j++){
                if(j==0)
                    previous=a+Math.pow(2,0)*b;

                else
                    previous=Math.pow(2,j)*b;

                out=store+previous;
                store=out;

//                System.out.println(store);
                System.out.print((int)out+" ");
            }
            System.out.println("");
        }

    }
}



//Using method it give me the true value ,but you should enter the testcase  by keyboard not copy and paste the test case
//"I don't know why until this moment ???????????????"

//Second Soutlion

//import java.util.Arrays;
//import java.util.Scanner;
//
////Name is Java Loops II
////Link is " https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true&h_r=next-challenge&h_v=zen "
//public class Problem0007 {
//    public static void main (String []args){
//        Scanner input=new Scanner(System.in);
//        int num=input.nextInt();
//        loops(num);
//    }
//    public static void loops(int iteration){
//        Scanner input2=new Scanner(System.in);
//        int [][] Array=new int[iteration][3];
//        for(int i=0;i<iteration;i++) {
//            for(int j=0; j<3;j++){
//                Array[i][j]=input2.nextInt();
//            }
//        }
////        System.out.println(Arrays.deepToString(Array));
//        for(int i=0;i<iteration;i++){
//            int a=Array[i][0];
//            int b= Array[i][1];
//            int n=Array[i][2];
//            double previous=0;
//            double out=0;
//            double store=0;
//            for(int j=0; j<n;j++){
//                if(j==0)
//                    previous=a+Math.pow(2,0)*b;
//
//                else
//                    previous=Math.pow(2,j)*b;
//
//                out=store+previous;
//                store=out;
//
////                System.out.println(store);
//                System.out.print((int)out+" ");
//            }
//            System.out.println("");
//
//        }
//
//    }
//}
