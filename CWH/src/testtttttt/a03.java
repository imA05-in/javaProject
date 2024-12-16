package testtttttt;
class Base implements Runnable{
    @Override
    public void run() {
        int i =0;
        while (i<1000){
        System.out.println("Thread form base. "+i);
        i++;
        }
    }
}
class Base1 implements Runnable{
    @Override
    public void run() {
        int j = 0;
        while(j<1000){
            System.out.println("thread from base1. "+j);
            j++;
        }
    }
}
public class a03 {
    public static void main(String[] args) {
        Base base = new Base();
        Thread t1 = new Thread(base);
        t1.start();
        Base1 base1 = new Base1();
        Thread t2 = new Thread(base1);
        t2.start();
//        base1.run();
//        base.run();
    }
}
