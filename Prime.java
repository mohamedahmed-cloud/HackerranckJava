import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(4.0/0);
        Mass x=new Mass();
        System.out.println(x.mag);

    }
}

class Mass {
    String mag;
    Mass(){
        this("h");
    }
    Mass(String mag){
        this.mag=mag+"hello";
    }
}