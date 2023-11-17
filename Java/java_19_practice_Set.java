
import java.util.Scanner;

public class java_19_practice_Set {
    public static void main(String[] args) {
        //Q1.What will be the output of the given program?
     /*   int a = 10;
        if (a == 11) {
            System.out.println("I am 11");
        } else {
            System.out.println("I am not 11");
        }

        //Q2.Write a program to find out whether a student is pass or fail; if it requires total 40% and atleast 33% in each subject to pass.
        //Take input from user.

        Scanner sc = new Scanner(System.in);
        System.out.println("Subject 1 marks out of 100:");
        int sub1 = sc.nextInt();
        System.out.println("Subject 2 marks out of 100:");
        int sub2 = sc.nextInt();
        System.out.println("Subject 3 marks out of 100:");
        int sub3 = sc.nextInt();

        if (sub1 >= 33 && sub2 >= 33 && sub3 >= 33 && (sub1 + sub2 + sub3) / 3 >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        //Calculate income tax paid by an employee to the government as per the slabs mentioned below:
        System.out.println("Enter your pay in lakhs");
        int pay = sc.nextInt();
        if (pay > 1000000) {
            System.out.println("Tax" + 0.3 * (pay - 250000));
        } else if (pay > 500000) {
            System.out.println("Tax" + 0.2 * (pay - 250000));
        } else if (pay > 250000) {
            System.out.println("Tax" + 0.05 * (pay - 250000));
        } else {
            System.out.println("No tax");
        }


        //Q4 .Write a program to find out the day of the week given the number.

        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Doesn't make sense");
        }

        //Q5..Write a program to find whether a year entered by the user is a leap year or not.

        int year=sc.nextInt();
        if ((year/4==0&&year/100!=0)||(year/400==0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Non leap year");
        }
*/
        //Write a program to find out the type of website from the url.
Scanner sc=new Scanner(System.in);
        String url=sc.nextLine();
        if(url.contains(".com")){
            System.out.println("Commercial website");

        }
        else if(url.contains(".org")){
            System.out.println("Organizational website");
        }

        else{
            System.out.println("Indian website");
        }
        //use endswith
    }

}
