import java.util.Locale;
import java.util.Scanner;
public class java_15_practiceSet {

    public static void main(String[] args) {
        //Q1.Write a java program to convert a string to lowercase.
        System.out.println("Enter string:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Lowercase string is:"+str.toLowerCase(Locale.ROOT));

        //Q2.Write a java program to replace spaces with underscore.
        System.out.println("Replacing spaces with underscore , we have :"+str.replace(' ','_'));

        //Write a java program to fill in a letter template ehich looks like below:
        /*letter ="Dear <|name|>,Thanks a lot*/

        String letter="Dear name,Thanks a lot!";
        String newstr= sc.next();
        System.out.println(letter.replace("name",newstr));

        //Write a program to detect double and triple spaces in a string.

        String strr="hi  hello   ";
        System.out.println(strr.indexOf("  "));
        System.out.println(strr.indexOf("   "));
        //If -1 comes then that index s not present.


        //Write a program to format the following letter using escape sequence characters .
        System.out.println("Dear Shreya\nFocus on you\n\t Thank you!");
    }

}
