package ch09;
class rect{
    private int length;
    private int breadth;
    public rect(){
        length = 4;
        breadth = 5;
    }
    public void Pdt(){
        System.out.println(this.length);
    }
    public rect(int length,int breadth){
        this.breadth = breadth;
        this.length =  length;
    }
}
public class ch03 {
    public static void main(String[] args) {
        rect rect = new rect();
        rect rect1 = new rect(6,7);
        rect1.Pdt();
//        rect rect = new rect(5,6);
    }
}
