public class java_31_methodsInJava {
     int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;

        }
        else{
            z=x-y;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=5 ;
        int b=7;
        java_31_methodsInJava obj=new java_31_methodsInJava();
        int c=obj.logic(a,b);
        System.out.println(c);
    }
}
