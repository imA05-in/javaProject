package test1;
class one{
    one(){
        two twoo = new two();
        twoo.print1();
    }
    public void print(){
        System.out.println("hi from one");
    }
}
class two extends one{
    two(){

    };
    public void print1(){
        System.out.println("hi from two");
    }
}
public class a01 {
    public static void main(String[] args) {
        one One = new one();

    }
}
