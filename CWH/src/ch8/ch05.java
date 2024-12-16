package ch8;

import java.util.Scanner;

public class ch05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle cr = new circle();
        cr.getRadius(6);
        cr.printDetails();
    }
}
class circle{
    int radius;

    public int getRadius(int radii) {
        radius = radii;
        return radius;
    }
    public float area(){
        float area = (22/7f)*radius*radius;
        return  area;
    }
    public float circumfrence(){
        float circum = 2*radius*(22/7f);
        return circum;
    }
    public void printDetails(){
        System.out.println("raius: "+radius);
        System.out.println("area: "+area());
        System.out.println("circumference: "+circumfrence());
//        System.out.println("area: "+area);
//        System.out.println("circumference: "+circum);
    }
}