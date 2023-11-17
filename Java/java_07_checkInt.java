import java.util.Scanner;

public class java_07_checkInt {
    public static void main(String[] args) {
        //Write a java program to detect whether a number entered by the user is integer or not.
        Scanner number=new Scanner(System.in);
        System.out.println("Enter the number");
        System.out.println(number.hasNextInt());
    }
}
