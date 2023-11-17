public class java_29_7 {
    public static void main(String[] args) {
        //Write a java program to find the minimum element in an array.
        int[] arr={-9,89,76,45,23,90};
        int min=Integer.MAX_VALUE;
        //similarly minvalue can be used in before question
        for (int e:arr){
            if(e<min){
                min=e;
            }
            else{
                continue;
            }
        }
        System.out.println(min);
    }
}


