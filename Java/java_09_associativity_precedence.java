public class java_09_associativity_precedence {
    public static void main(String[] args) {
        //int a=6*5-34/2;
       // int b=34/2-6*5;
        //System.out.println(a);
        //System.out.println(b);
        //Precedence and associativity
        //associativity of this type is left to right

       // a=b=45;
        //associativity in this case is right to left

        //Quick quiz
        int a=4;
        int b=5;
        int c=6;
        int d=(b*b-4*a*c)/(2*a);
        System.out.println(d);
    }
}
