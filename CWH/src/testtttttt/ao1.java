package testtttttt;
class Thread1 extends Thread {

    public void run() {
        int i = 1000;
        while(i>0){
        System.out.println("thread 1.");
        i--;
    }
    }
}
    class Thread2 extends Thread {
        public void run() {
            int j = 1000;
            while (j > 0) {
                System.out.println("thread 2");
                j--;
            }
        }
    }

public class ao1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
