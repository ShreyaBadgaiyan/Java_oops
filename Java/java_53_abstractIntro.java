


    abstract class Base{

        //This is the constructor of Base class
        public Base(){
            System.out.println("This is the constructor of Base");

        }

        public void sayHello(){
            System.out.println("Hello");
        }

        abstract public void greet();
          //This means the base is saying to the child classes that they can themselves overwrite greet class.
//Error was showing before because we hadn't declared class as abstract while the function contained abstract method in it.

    }
//Base helps create standard class

    class child extends Base{
        @Override
       public void greet(){
        System.out.println("Good Morning");
       } 
    }

    abstract class child2 extends Base{
        public void eg(){
            System.out.println("jsdjb");
        }
    }
    public class java_53_abstractIntro {
    public static void main(String[] args) {
        //Illustrating the implementation of Abstraction in Java

        child obj=new child();
        obj.greet();
        obj.sayHello();

        //Objects of base and child2 cannot be created because they are abstract classes.
        


    }
}