package idk;

import java.util.Scanner;

class methds{
    void hi(int x){
        System.out.println("hi: "+x);
    }
    void hi(){
        System.out.println("hi hello.");
    }
    void hi(int x, int y){
        System.out.println("hi from: "+x+","+y);
    }
}
public class ovrld {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("enter x and y: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        methds metds_object1 = new methds();
        metds_object1.hi(1);
        metds_object1.hi(a,b);
        metds_object1.hi();
    }
}
