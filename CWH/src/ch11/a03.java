package ch11;
abstract class monkey{
    public abstract void jump();
    abstract void bite();
}
interface BasicHuman{
    public void eat();
    public void sleep();
}
class human extends monkey  implements BasicHuman{
    public void jump(){
        System.out.println();
    };
    public void bite(){
        System.out.println("human bites");
    }
//    @overide
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("human sleeps");
    }
    void actions(){
        jump();
        bite();
        eat();
        sleep();
    }
}
public class a03 {
    public static void main(String[] args) {
        human human = new
                human();
        human.actions();
    }
}
