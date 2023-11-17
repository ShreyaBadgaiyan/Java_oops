
class base{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am setting  x now");
        this.x=x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class derived extends base{
    //All the things present in base class will be available in this Derived class.
int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}



public class java_45_inheritance {
    public static void main(String[] args) {
        derived gullu=new derived();
        gullu.setX(45);
        System.out.println(gullu.getX());
        base sb=new base();
        sb.setX(89);
        System.out.println(sb.getX());
        gullu.setY(34);
        System.out.println( gullu.getY());

    }
}