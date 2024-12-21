package ch13;
class ThRun implements Runnable{
    @Override
    public void run() {
        System.out.println("thread 1");
    }
}

public class Z02 {
    public static void main(String[] args) {
        ThRun thRun = new ThRun();
        Thread thread = new Thread(thRun);
        thread.start();
    }
}
