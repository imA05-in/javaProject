package Package3;

public class test {//call subclass with baseclass obj?
    public static void main(String[] args) {
        Baseclass baseclass = new Baseclass();
        Subclass subclass = new Subclass();
        baseclass.sout1();
        subclass.sout1();
        subclass.sout();
//        System.out.println(baseclass);
    }
}
class Baseclass{
    public void sout1(){
        System.out.println("from Baseclassssssss.");
    }
}
class Subclass extends Baseclass{
//    public void sout1(){
//        System.out.println("overridden form baseclass");
//    }
    public void sout(){
        System.out.println("Subclasssssssss.");
    }
}
