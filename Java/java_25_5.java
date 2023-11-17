import java.util.Scanner;

public class java_25_5 {
    public static void main(String[] args) {
        //Q5.Write a program to find factorial of a given number using for loop.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n to find factorial");
        int n=sc.nextInt();
        int fact=1;
        for (int i = 1; i <=n; i++) {
            fact=fact*i;

        }
        System.out.println(fact);
    }
}
