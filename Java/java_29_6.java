public class java_29_6 {
    public static void main(String[] args) {
      //Write a java program to find the maximum element in an array.
        int[] arr={1,89,76,45,23,90};
        int max=0;
        for (int e:arr){
            if(e>max){
                max=e;
            }
            else{
                continue;
            }
        }
        System.out.println(max);
    }
}
