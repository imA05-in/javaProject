package Package3;

public class test01 {
    public static void main(String[] args) {
//        base base = new base();
        sub sub = new sub();
    }

    }
    class base{
    base(){
        System.out.println("base constructor.");
    }
    base(int a){
        System.out.println("overloaded constructor");
    }

    }
class sub extends base{
    sub(){
        super(0);
        System.out.println("sub constructor");
    }

}
