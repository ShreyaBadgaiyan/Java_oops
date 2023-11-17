import java.util.Scanner;

public class java_06_exercise1 {
    public static void main(String[] args){
        //Write a program to calculate percentage of a given student in CBSE board exam.
        //His marks in 5 subjects must be taken as input from user from the keyboard

        System.out.println("Convert marks to percentage");
        Scanner marks=new Scanner(System.in);
        System.out.println("Enter marks of subject 1");
        int marks1=marks.nextInt();
        System.out.println("Enter marks of subject 2");
        int marks2=marks.nextInt();
        System.out.println("Enter marks of subject 3");
        int marks3=marks.nextInt();
        System.out.println("Enter marks of subject 4");
        int marks4=marks.nextInt();
        System.out.println("Enter marks of subject 5");
        int marks5=marks.nextInt();
        int sum=marks1+marks2+marks3+marks4+marks5;
        System.out.println("The sum is "+sum);
        int percent=sum*100/500;
        System.out.println("The percentage is "+percent);
    }
}
