import java.util.Scanner;

public class java_25_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int i=10;
        while(i>0){
            System.out.println(i*n);
            i--;
        }
    }
}
