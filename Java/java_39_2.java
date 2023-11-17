
class cellphone{
    public void ring(){
        System.out.println("Ringing..");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }

}

public class java_39_2 {
    public static void main(String[] args) {
        cellphone Nokia=new cellphone();
        Nokia.ring();
        Nokia.vibrate();
    }
}
