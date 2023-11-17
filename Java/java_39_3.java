
class Square{


    public int getArea( int side){
        return side*side;
    }

    public int getPerimeter(int side){
        return side*4;
    }

}
class Rectangle{


    public int getArea( int length,int breadth){
        return length*breadth;
    }

    public int getPerimeter(int length,int breadth){
        return (length+breadth)*2;
    }

}

 class Circle{
     public double getArea( int side){
         return Math.PI*side*side;
     }

     public double getPerimeter(int side){
         return 2*Math.PI*side;
     }

}

public class java_39_3 {
    public static void main(String[] args) {
        Square hehe=new Square();
        Rectangle ayyt=new Rectangle();
        Circle woah=new Circle();
        System.out.println(hehe.getArea(4));
        System.out.println(hehe.getPerimeter(5));
        System.out.println(ayyt.getArea(4,5));
        System.out.println(ayyt.getPerimeter(5,6));
        System.out.println(woah.getArea(4));
        System.out.println(woah.getPerimeter(5));


    }
}
