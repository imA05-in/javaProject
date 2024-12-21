package ch13;

public class A01 {

    public static void main(String[] args) {
    Thread1 t1 = new Thread1();
    Thread2 t2 = new Thread2();
    t1.start();
    t2.start();

    }
}
class Thread1 extends Thread {
    @Override
    public void run () {
    int i = 0;
    while(i<100){
        System.out.println("Thread1");
        i++;
    }
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
    int j = 0;
    while(j<100){
        System.out.println("Thread2");
        j++;
    }
    }
}
