import java.util.Scanner;

public class java_07_greeting {
    //Write a java program which asks the user to enter his/her name and greets them with Hello <name> , have a good day text.

    public static void main(String[] args) {

        Scanner greet= new Scanner(System.in);
        System.out.println("Enter your name");
        String name=greet.next();
        System.out.println("Hello "+ name+" ,have a good day!");
    }
}
