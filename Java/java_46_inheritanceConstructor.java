
class Base1{


    Base1() {
        System.out.println("I am a constructor");
    }
    Base1(int a) {
        System.out.println("I am a constructor"+a);
    }

    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

    class Derived1 extends Base1{

    Derived1(){
        super(78);
        System.out.println("I am constructor 2");
    }
        Derived1(int b){
            System.out.println("I am constructor 2"+b);
        }

    public int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }




public class java_46_inheritanceConstructor {
    public static void main(String[] args) {

        Base1 b=new Base1(45);
        Derived1 d=new Derived1();


    }
}
