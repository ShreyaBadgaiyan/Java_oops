import java.util.Scanner;

public class java_22_doWhileLoop {
    public static void main(String[] args) {
        //Do-while loop

        int a=0;
        do{
            System.out.println(a);
            a++;
        }while(a<0);

        
        //The program works atleast ones.
        //Write a program to print first n natural numbers using do-while loop.

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        do{
            System.out.println(a);
            a++;
        }while(a<=n);
    }
}
