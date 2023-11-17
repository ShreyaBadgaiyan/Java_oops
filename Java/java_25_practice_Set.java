import java.util.Scanner;
public class java_25_practice_Set {
    public static void main(String[] args) {
        //Q1. Star Pattern
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n= sc.nextInt();
        for(int i=n;i>0;i--){
           for (int j=0;j<i;j++){
               System.out.print("*");
           }
            System.out.println("\n");
        }



    }
}
