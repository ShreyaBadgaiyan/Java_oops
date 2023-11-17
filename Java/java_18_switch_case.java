import java.util.Scanner;

public class java_18_switch_case {
    public static void main(String[] args) {
        //Else if clause: used for multiple conditions
        //This is called else-if ladder

        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if (age>56){
            System.out.println("You are experienced");
        }
        else if(age>46){
            System.out.println("You are semi-experienced");
        }
        else{
            System.out.println("You need to gain more experience");
        }


        //Switch Case Control Instruction
        //It is used when we have to make a choice between a number of alternatives.

        String fruit=sc.next();
        switch (fruit) {
            case "Mango" -> System.out.println("Sweet yellow fruit");
            case "Apple" -> System.out.println("Keeps doctor away");
            default -> System.out.println("Woww");
        }
        }
        //If break is not used then all other cases after the correct one will be executed including default.



    }

