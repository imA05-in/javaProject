package ch13;

public class A01 {

    public static void main(String[] args) {
    ThreadGoodMorning t1 = new ThreadGoodMorning();
    ThreadWelcome t2 = new ThreadWelcome();
    t1.start();
    t2.start();

    }
}
class ThreadGoodMorning extends Thread {
    @Override
    public void run () {
    int i = 0;
    while(i<100){
        System.out.println("good morning");
        i++;
    }
    }
}
class ThreadWelcome extends Thread{
    @Override
    public void run() {
    int j = 0;
    while(j<100){
        System.out.println("welcome");
        j++;
    }
    }
}
