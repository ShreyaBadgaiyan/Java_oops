public class java_29_8 {
    public static void main(String[] args) {
        int[] arr={13,45,67,78,90};
        boolean isSorted=true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                isSorted=false;

                break;
            }

        }
        if (isSorted){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not sorted");
        }
    }
}
