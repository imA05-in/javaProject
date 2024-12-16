package Package2;

public class P2class2 {
    public String str = "str";
    private String strP = "strP";
    String strD = "strD";

    public static void main(String[] args) {
        P2class2 p2class2 = new P2class2();
        p2class2.strP = "Hello";
        System.out.println(p2class2.strP);
    }
    class P2class2_1 extends P2class2{
//        strP = "hi";

    }
}
