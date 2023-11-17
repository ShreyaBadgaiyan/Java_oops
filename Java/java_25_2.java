import java.util.Scanner;

public class java_25_2 {
    public static void main(String[] args) {
         //Write a program to sum first n even numbers using while loop.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=sc.nextInt();
        int i=0;
        int sum=0;
        while(i<=n){
            sum=sum+i;
            i=i+2;
        }
        System.out.println("The sum of n even numbers is"+sum);
    }
}
