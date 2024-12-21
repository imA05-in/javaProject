package ch11;
//import java.util.
abstract class c1{
    void c1(){
        System.out.println("c1 constructor called");
    }
    void idk(){};
    void ik(){
        System.out.println("ik");
    }
}
class b1 extends c1{
    //no need for method declaration!
}
//interface c2 extends c1{} not possible (an interface cannot extend an abstract class)
public class Test {
    public static void main(String[] args) {
        b1 b1 = new b1();
        b1.ik();
    }
}
