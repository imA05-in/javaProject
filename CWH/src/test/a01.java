package test;

import java.util.Scanner;
class name{
    String names = "hi";
    name(){
        this.names = "kaliya danger";
    }
    public String name(){
        names = "moded KD";
        return this.names;

    }
//    public void name(){
//        System.out.println("hi");
//    }
}
public class a01 {
    public static void main(String[] args) {
    name nam = new name();
        System.out.println(nam.names);
        System.out.println(nam.name());
        System.out.println(nam.names);
    }

}
