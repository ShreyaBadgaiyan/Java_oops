
class Students{
    int rno;
    String name;

    public Students(String myName,int rNo){
        rno=rNo;
        name=myName;
    }

}


public class java_42_constructor {
    public static void main(String[] args) {
        Students sb=new Students("Gullu",14);
        System.out.println(sb.name);
        System.out.println(sb.rno);

    }
}
