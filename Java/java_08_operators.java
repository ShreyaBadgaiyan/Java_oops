public class java_08_operators {
    public static void main(String[] args) {
        int a=4;
        int b=6+a;
        System.out.println(b);
        int c=6%a;
        System.out.println(c);//modulo operator
        b+=3;
        System.out.println(b);
        System.out.println(6==8);
        System.out.println(6>=4);
        System.out.println(64>4 && 64>97);
        System.out.println(64>4 || 64>97);

        System.out.println(2&3);//Bitwise and
        System.out.println(2|3);//Bitwise or

        //% gives decimal remainder also
        System.out.println(4.8%1.1);
    }
}
