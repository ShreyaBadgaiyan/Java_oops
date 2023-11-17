import java.sql.SQLOutput;
import java.util.Scanner;

public class java_29_2 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        System.out.println("Enter integer to check");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isInArray=false;
        for (int i = 0; i < arr.length; i++) {
            if(n==arr[i]){
                isInArray=true;
                break;
            }

//for (int i:arr){isInArray=true;break;}


        }
        if(isInArray){
            System.out.println("Integer present");
        }
        else{
            System.out.println("Integer absent");
        }


    }
}
