
class Cylinder{
    private int radius;
    private int height;

    public Cylinder(){
        radius=30;
        height=0;
  }

    public Cylinder(int myR,int myH){
        radius=0;
        height=30;
    }
    public void setRadius(int rad){
         radius = rad;
    }

    public int getRadius(){
        return radius;

    }

    public void setHeight(int h){
        height=h;

    }

    public int getHeight(){
        return height;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }

    public double area(){
        return Math.PI*2*radius*(height+radius);
    }

}

public class java_44_practiceSet {
    public static void main(String[] args) {
        //Q1. Create a class cylinder and use getters and setters to set its radius and height.

        Cylinder shape=new Cylinder();
//        shape.setHeight(40);
//        shape.setRadius(45);
        System.out.println(shape.getHeight());
        System.out.println(shape.getRadius());
        System.out.println(shape.area());
        System.out.println(shape.volume());
    }
}
