import java.util.Scanner;

public class java_07_cgpa {
    public static void main(String[] args) {
        //Write a program to calculate CGPA using marks of three subjects (out of 100)
        Scanner marks= new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1=marks.nextInt();//or float all
        System.out.println("Enter number 2");
        int num2=marks.nextInt();
        System.out.println("Enter number 3");
        int num3=marks.nextInt();
        int sumf=num1+num2+num3;
        double cgpa=sumf/30.0;
        System.out.println("The sum given marks is "+sumf);
        System.out.println("The cgpa of given marks is"+cgpa);
    }
}
