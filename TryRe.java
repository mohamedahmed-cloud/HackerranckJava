import java.util.Arrays;

public class TryRe {
    public static void main(String[]args){
//        Scanner scanner=new Scanner(System.in);
//        int a=scanner.nextInt();
//        System.out.println(fac(a));
        int [] arr={1,2,3,4};
//        String arr2=Arrays.toString(arr);
//        int shift=arr[0];
//        for(int i =0; i<arr.length-1;i++){
//            arr[i]=arr[i+1];
//        }
//        arr[arr.length-1]=shift;
//        System.out.println(arr2);
        System.out.println(Arrays.toString(arr));

    }
    public static int fac(int a){
        if(a==1 || a==0){
            return a;
        }else{
            return fac(a-1)+fac(a-2);
        }
    }
}
