
 class MyEmployee{
   private int id;
   private String name;

   public void setName(String n){
       name=n;
   }
   public String getName(){
       return name;
   }
     public void setID(int n){
         id=n;
     }
     public int getID(){
         return id;
     }



}

public class java_40_accessModifiersGetterSetter {
    public static void main(String[] args) {
        MyEmployee shreya=new MyEmployee();
        shreya.setName("Gullu");
        System.out.println(shreya.getName());
        shreya.setID(45);
        System.out.println(shreya.getID());
    }
}
