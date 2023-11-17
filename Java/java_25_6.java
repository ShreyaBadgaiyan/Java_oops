import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class java_25_6 {
    public static void main(String[] args) {
        //Q6.Write a program to find factorial of a given number using while loop.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n to find factorial");
        int n= sc.nextInt();
        int i=1;
        int fact=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println(fact);
    }
}
