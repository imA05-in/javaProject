package ch13;
class Thread3 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread3");
    }
}
public class A04 {
    public static void main(String[] args) {
    Thread3 thread3 = new Thread3();
    Thread t3 = new Thread(thread3);
        System.out.println(t3.getState());
    }
}
