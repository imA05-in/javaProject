package ch13;
class Thread1 implements Runnable{
    @Override
    public void run() {
        int j = 1;
        while(j<100){
            j++;
        System.out.println("Thread!");
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
    int i = 100;
    while(i>0){
        System.out.println("Thread2");
        i--;
            }
    }
}
public class A03 {
    public static void main(String[] args) {
    Thread1 thread1 = new Thread1();
    Thread t1 = new Thread(thread1);
    Thread2 t2 = new Thread2();
    t1.setPriority(1);
    t2.setPriority(10);
    t1.start();
    t2.start();
    }
}
