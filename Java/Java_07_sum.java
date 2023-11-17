import java.util.Scanner;

public class Java_07_sum {
    //Write a program to sum 3 numbers in Java
    public static void main(String[] args) {
        Scanner sum= new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1=sum.nextInt();
        System.out.println("Enter number 2");
        int num2=sum.nextInt();
        System.out.println("Enter number 3");
        int num3=sum.nextInt();
        int sumf=num1+num2+num3;
        System.out.println("The sum given three numbers is "+sumf);
    }


}
