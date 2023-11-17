
 class Employee{
    //id and name are attributes
    int id;
    String name;
    int salary;
    public void printDetails(){
         System.out.println("My id is "+id);
         System.out.println("and my name is "+name);
     }
     public void incrementation(){
        salary=salary+700;
         System.out.println("Incremented salary"+salary);
     }
}
/*In a single java file, we can have only 1 public class,
 in case nothing such as public is written before class,
 the access modifier is set default*/

public class java_38_customClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry=new Employee();//Instantiating a new employee object
        Employee shreya=new Employee();
        //Setting attributes
        harry.id=101;
        harry.name="Harish";
        harry.salary=7000;
        shreya.id=102;
        shreya.name="Gullu Badgaiyan";
        shreya.salary=8000;
        //Printing attributes/properties
        harry.printDetails();
        harry.incrementation();
        shreya.printDetails();
        shreya.incrementation();

        //Any real world object = properties +behaviour;
        //Objects in OOPs= Attributes + Methods;

    }
}
