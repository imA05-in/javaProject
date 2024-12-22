package ch13;
class Thread5 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread5");
            }
}
public class A05 {
    public static void main(String[] args) {
    Thread5 thread5 = new Thread5();
        System.out.println(Thread.currentThread());
    }
}
