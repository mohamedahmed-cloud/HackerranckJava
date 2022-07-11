//name is Java Datatypes
//link is "https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen"
public class Problem0008 {
    public static void main(String[] args) {
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.print("GRADE-A ");
            case 'C':
                System.out.print("GRADE-B ");
            case 'B':
                System.out.print("GRADE-C ");
            default:
                System.out.print("Error ");
                break;
        }
        int a = 9;
        float b = a++ / 2;
        System.out.println(b);
        System.out.println("result = " + a + b);

    }
}
