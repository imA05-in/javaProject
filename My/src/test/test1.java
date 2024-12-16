package test;
 abstract class class01{
     class01(){
         System.out.println("class01 constructor called");
     }
    public final int age = 5;
    public int age1 = 6;
    int age2 = 7;
}
class class01_1 extends class01{
     class01_1(){
         System.out.println("sub class constructor called");
     }
     public int age0 = 6;
     public int age1 = 9;
}
public class test1 {
    public static void main(String[] args) {
        class01_1 class011 = new class01_1();
        System.out.println(class011.age);
        System.out.println(class011.age1);
    }
}
