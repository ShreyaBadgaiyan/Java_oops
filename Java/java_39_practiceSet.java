
class Employees {
    int Salary;
    String name;
    public int getSalary(){
        return Salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name=newName;


    }

}

public class java_39_practiceSet {
    //Create a class Employee with the following properties
    public static void main(String[] args) {
        Employees Shreya=new Employees();
        Shreya.Salary=5000;
        Shreya.name="Shreya Badgaiyan";
        System.out.println(Shreya.getName());;
       Shreya.setName("Gullu Badgaiyan");
        System.out.println(Shreya.getSalary());

        System.out.println(Shreya.getName());

    }

}
