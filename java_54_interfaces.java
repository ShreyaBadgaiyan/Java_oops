    
interface Bicycle{
    void applyBrake(int increment);
    void speedUp(int decrement);
}

class AvonCycle implements Bicycle{
    int speed=7;
    public void applyBrake(int decrement){
        speed=speed-decrement;
        System.out.println(speed);
    }
    public void speedUp(int increment){
        speed=speed+increment;
        System.out.println(speed);
    }
}




public class java_54_interfaces {
    public static void main(String[] args) {
        AvonCycle obj=new AvonCycle() ;
        obj.applyBrake(6);
        obj.speedUp(8);
        
    }
}
