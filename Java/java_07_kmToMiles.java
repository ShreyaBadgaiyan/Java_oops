import java.util.Scanner;

public class java_07_kmToMiles {
    public static void main(String[] args) {
      Scanner distance=new Scanner(System.in);
      System.out.println("Enter distance in kilometers");
      float km=distance.nextFloat();
      float mile= (float) (km/1.6);
        System.out.println("Distance in miles is "+mile);
    }
}
