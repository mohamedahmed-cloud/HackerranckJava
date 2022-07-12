/*
problem Name : Java Abstract Class
Problem Link : https://www.hackerrank.com/challenges/java-abstract-class/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

*/
import java.util.Scanner;

public class Problem028 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();

    }
}

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class MyBook extends Book{
    MyBook(){

    }
    void setTitle(String s){
        title=s;
    }
}