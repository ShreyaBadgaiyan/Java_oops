//All properties of interfaces cannot be modified, like if you assign some variable in the interface , it cannot be reassigned at the main function.

interface marks{
    void addMarks(int m);
    void givePercentage(int p);

}

interface pass{
    int k=90;
    void areYouPass(boolean a);
}




class Student implements marks , pass{
    
      public void addMarks (int m){
        System.out.println(m);

      }
    public void givePercentage(int p){
        
        System.out.println(p);

    }
    public void areYouPass(boolean a){
        System.out.println(a);
    }
}

public class java_55_moreInterface{
    public static void main(String[] args) {
        Student std=new Student();
        std.addMarks(9);
        std.givePercentage(90);
        std.areYouPass(true);
        
        
    }
}