package test1;

import org.w3c.dom.ls.LSOutput;

class base{
    String color = "red";
    public void on(){
        System.out.println("turning on base.");
    }
}
class sub extends base{
    String color = "pink";
    String size = "compact";
    public void on(){
        System.out.println("turning on sub");
    }
    public void hi(){
        System.out.println("hi from sub.");
    }
}
public class a02 {

    public static void main(String[] args) {
    base  obj = new sub();
        System.out.println(obj.color);
        obj.on();
//        obj.hi():
//        System.out.println(obj.size);
    }
}
