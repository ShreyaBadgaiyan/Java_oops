public class java_29_3 {
    //Calculate the average marks from an array containing marks of all students in Physics using for-each loop.
    public static void main(String[] args) {
        int[] marks={40,60,50,70};
        int sum=0;
        for(int i:marks){
            sum=sum+i;
        }
        int avg=sum/marks.length;
        System.out.println(avg);
    }
}
