public class java_27_forEach {
    public static void main(String[] args) {
        //length of an array
        int[] arr={14,15,16,17,18};
        System.out.println(arr.length);

        //Displaying an array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println("\n");

        //Displaying array in reverse order
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        
        //forEach loop

        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("\n");


        int i=0;
        while(i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
    }
}
