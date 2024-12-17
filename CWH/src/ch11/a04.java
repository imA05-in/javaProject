package ch11;
abstract class Telephone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
}
class SmartPhones extends Telephone{
    //runtime polymorphism
    public void ring(){
        System.out.println("smart phone rings");
    }
    public void lift(){
        System.out.println("answers call");
    }
    public void disconnect(){
        System.out.println("disconnects call");
    }
}
public class a04 {
    public static void main(String[] args) {
        SmartPhones smartPhones = new SmartPhones();
        smartPhones.ring();
        smartPhones.lift();
        smartPhones.disconnect();
    }
}
