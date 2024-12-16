package ch8;

public class ch04 {
    public static void main(String[] args) {
    tommyVectti tV_obj1 = new tommyVectti();
    tV_obj1.hit();
    String fire = tV_obj1.fire();
        System.out.println(fire);
        tV_obj1.run();
    }
}
class tommyVectti{
//    String name = "Tommy";
    StringBuilder name = new StringBuilder("Tommy");
    public String hit(){
        System.out.println(name+" hitting");
        return "hitting";
    }
    public String run(){
        System.out.println(name+" is running.");
        return " is running.";
    }
    public String fire(){
        System.out.println(name+" is firring.");
        return name+" is firing.";
    }
}
