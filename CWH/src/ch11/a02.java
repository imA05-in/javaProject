package ch11;
class FountainPen extends Pen{
    public void write(){
        System.out.println("Fountain Pen writes");
    }
    public void refil(){
        System.out.println("refil changed.");
    }
    void changeNib(){
        System.out.println("nib changed.");
    }
}
//class te extends test
public class a02 {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.write();
    }
}
