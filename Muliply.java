import java.util.Arrays;
import java.util.Scanner;

public class Muliply {
    public static void main(String []args){
        int [][] listOne=new int[3][3];
        int [][] listTwo=new int[3][3];

        Scanner scanner=new Scanner(System.in);
        for(int i=0 ;i< listOne.length;i++){
            for(int j=0;j<listOne[0].length;j++){
                listOne[i][j]=scanner.nextInt();
            }
        }
        for(int i=0 ;i< listTwo.length;i++){
            for(int j=0;j<listTwo[0].length;j++){
                listTwo[i][j]=scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(listOne));
        System.out.println(Arrays.deepToString(listTwo));
        int [][] Result=new int[3][3];
        Result=getMul(listOne,listTwo);
        System.out.println(Arrays.deepToString(Result));
        for(int i =0 ;i< Result.length;i++){
            for(int j =0 ;j<Result[0].length;j++){
                System.out.println(Result[i][j]);
            }
        }
    }
    public static int[][] getMul(int[][] list1,int[][] list2){
        int [][] out=new int[3][3];
        int s=0;
        if(list1.length==list2[0].length){
            for(int i =0 ;i<list1.length;i++){
                for(int k=0;k<list2[0].length;k++){
                    s=0;
                    for(int j=0;j<list1[0].length;j++){
                        s+=list1[i][j]*list2[j][k];
                     out[i][k]=s;
                }
                }
            }

        }else{
            System.out.println(" We Cant Multiply This array");
        }

        return out;
    }
}
