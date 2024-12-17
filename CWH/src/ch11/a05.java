package ch11;
class mokiMan extends monkey{
    void jump(){
        System.out.println("jumping!");
    }
    void bite(){
        System.out.println("biting");
    }
}
public class a05 {
    public static void main(String[] args) {
        mokiMan mokiMan = new mokiMan();
        mokiMan.jump();
    }
}
