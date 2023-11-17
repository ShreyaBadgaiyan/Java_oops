public class java_29_5 {
    public static void main(String[] args) {
        //Reversing an array
        int[] arr={1,2,3,4,5,97,80};
        int l=arr.length;
        int n=Math.floorDiv(l,2);
        int temp;
        for (int i = 0; i < n; i++) {
            //Swap a[i] and a[l-i-1] using temporary container.
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;

        }
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }

    }


}
