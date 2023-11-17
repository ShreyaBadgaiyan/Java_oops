import java.util.Scanner;

public class java_12_operator_practice_set {
    // What will be the result of following expression?
    // float a=7/4*9/2
    public static void main(String[] args) {
        float a=7/4f*9/2f;
        float b=7/4*9/2;
        System.out.println(a);
        System.out.println(b);

        //Write a java program to encrypt a grade by adding 8 to it.Decrypt
        //it to show the correct grade.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the grade");
        int grade=sc.nextInt();
        grade+=8;
        System.out.println("The grade is"+grade);
        grade-=8;
        System.out.println("The original grade is"+grade);

        //Alternate

        char grades='B';
        grades=(char)(grade+8);
        System.out.println(grades);

        //Decrypting the grade
        grades=(char)(grades-8);
        System.out.println(grades);


    }
}
