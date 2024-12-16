package ch8;
import java.util.Scanner;

public class ch03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter breadth and length: ");
        int b = sc.nextInt();
        int l = sc.nextInt();
    rectangle rectangle_obj1 = new rectangle();
    rectangle_obj1.getBreadth(b);
    rectangle_obj1.getLength(l);
    rectangle_obj1.printDetails();
    }
}
class rectangle{
    int length;
    int breadth;
    public int getBreadth(int breadth1){
        breadth = breadth1;
        return breadth;
    }
    public int getLength(int length1) {
        length = length1;
        return length;
    }
    int area(int length, int breadth){
        int area = length * breadth;
        return area;
    }
    public int parameter(int l, int b){
        int parameter1 = 2*(b+l);
        return parameter1;
    }
    public void printDetails(){
        System.out.println(breadth);
        System.out.println(length);
        System.out.println(area(length,breadth));
        System.out.println(parameter(length,breadth));
    }
}
