import java.lang.Math;
import java.util.Scanner;

public class java_20_rockPaperScissor {
    public static void main(String[] args) {
    int a=(int)(Math.random()*3);
        System.out.println("Add number 0 for stone, 1 for paper and 2 for scissor");
    Scanner sc=new Scanner(System.in);

    int b=sc.nextInt();
    if (a==0&&b==1){
        System.out.println("You win");
        }
    else if(a==1&&b==0){
        System.out.println("PC wins");
    }
    else if(a==0&&b==2){
        System.out.println("PC wins");

    }
    else if(a==2&&b==0){
        System.out.println("You win");
    }
    else if(a==1&&b==2){
        System.out.println(("You win"));
    }
    else if(a==2&&b==1){
        System.out.println("PC wins");
    }
    else if(a==b){
        System.out.println("Draw");
    }

        System.out.println(a);
    }
}
