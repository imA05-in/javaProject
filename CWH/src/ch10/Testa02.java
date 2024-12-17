package ch10;
class base{
    private int side; //instance variables are not fucking shared!!  
    private int side1 = 7;

    public int getSide2() {
        int side2;
        return  side2 = 2;
    }

    public int getSide() {
        return side;
    }

    public void setSide() {
        this.side = 9;
    }
}
class sub extends base{
    public void print(){
//        super(setSide(4));
        System.out.println(super.getSide());
        System.out.println(super.getSide2());
    }
}

public class Testa02 {
    public static void main(String[] args) {
    base bs = new base();
    sub sb = new sub();
    bs.setSide();
    System.out.println(bs.getSide());
    sb.print();

    }
}
