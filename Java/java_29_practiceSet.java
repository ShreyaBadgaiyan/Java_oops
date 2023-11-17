public class java_29_practiceSet {
    public static void main(String[] args) {
        //Create an array of 5 floats and calculate their sum.
        float[] arr={10.5f,20.8f,30.7f,40.9f,50.6f};
        float sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
