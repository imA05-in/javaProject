package ch10;
import java.util.Scanner;
class cirArea{
     int radius;
    Scanner sc = new Scanner(System.in);
    circle cir = new circle();
    public cirArea(){
        System.out.print("enter circle radius: ");
        radius = sc.nextInt();
    }
    public float area(){
        float area = 2*(22f/7)*radius;
        return area;
    }
}
public class a03 {
    public static void main(String[] args) {
        cirArea cirA = new cirArea();
 ////
        System.out.println(cirA.area());
    }
}