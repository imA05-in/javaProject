package ch10;
class rectangle{
    private int bredth,length;

    public void setBredthLength(int bredth, int length) {
        this.bredth = bredth;
        this.length = length;
    }
    public int getBredth() {
        return bredth;
    }

    public int getLength() {
        return length;
    }

}
class cuboid extends rectangle{
    public int area(){
        int bredth = super.getBredth();
        int length = super.getLength();
        System.out.println(bredth+" "+length);
        int area = bredth*length;
        return area;
    }
    public void printDetails(){
        System.out.println(area());

    }
}
public class a02 {
    public static void main(String[] args) {
    rectangle rec = new rectangle();
    rec.setBredthLength(4,5);
    cuboid cu = new cuboid();
    cu.printDetails();
    cu.area();

    }
}
