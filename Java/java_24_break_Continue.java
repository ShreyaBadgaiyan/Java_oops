public class java_24_break_Continue {
    public static void main(String[] args) {
        //Break and continue with loop

        for(int i=0;i<5;i++){
            System.out.println(i);
            System.out.println("Java is great");
            if(i==2){
                System.out.println("Ending the loop");
                break;
                //Break overs the loop.
            }
        }

        for(int j=0;j<5;j++){

            if(j==1){
                System.out.println("Continue");
                continue;
            }
            System.out.println(j);
            System.out.println("Gullu");

        }
    }
}
