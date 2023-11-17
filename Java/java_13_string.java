import java.util.Scanner;

public class java_13_string {
    public static void main(String[] args){

        //String is not a primitive datatype in java but a class but there is special support of strings in java so can be used as primitive datatype as well.

        /**String name=new String("Shreya");
        String name2= "Gullu";
        System.out.println(name);
        System.out.println(name2);
        System.out.print(name);
        //no new line
        System.out.println(name);
        int a=6;
        float b=6.98f;
        System.out.printf("%d %f",a,b);
        //Similar to C language
        //System.out.printformat(name);

        System.out.format("%d %f",a,b);
        //Similar nature as printf**/

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2=sc.next();
        System.out.println(str);
        System.out.println(str2);
    }
}
