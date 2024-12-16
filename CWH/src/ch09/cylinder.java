package ch09;

public class cylinder{
    private int radius;
    private int height;
    public void setRadius(int r){
        radius = r;
    }
   public int getRadius(){
       return radius;
   }
   public void setHeight(int h){
        height = h;
   }
   public int getHeight(){
        return height;
   }
}
class printDet{
    public static void main(String[] args) {
cylinder obj = new cylinder();
        obj.setHeight(6);
        obj.setRadius(5);
        System.out.println("radius is: "+obj.getRadius());
        System.out.println("height is: "+obj.getHeight());
    }
}