package ch8;
class cellphone{
    public void ring(){
        System.out.println("ringing....");
    }
    public void vib(){
        System.out.println("vibrating..");
    }
}
public class ch01 {
    public static void main(String[] args) {
    cellphone phone = new cellphone();
    phone.ring();
    phone.vib();
    }


}
