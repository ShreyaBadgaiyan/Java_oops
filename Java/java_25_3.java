import java.util.Scanner;

public class java_25_3 {
    public static void main(String[] args) {
        //Q3.Write a program to print multiplication table of a given number n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int i = 0;
        while (i <=10) {
            System.out.println(i * n);
            i++;
        }
    }
}
