package ch13;
class Gm extends Thread {
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("Good morning pineapple!!!!");
            i++;
        }
    }
}
class Wlcm extends Thread {
    @Override
    public void run() {
        int j = 0;
        while (j < 1000) {
            System.out.println("Welcome");
            j++;
        }
    }
}
public class a01 {
    public static void main(String[] args) {
        Gm gm = new Gm();
//        Thread t1 = new Thread(gm);
        Wlcm wlcm = new Wlcm();
        gm.start();
        wlcm.start();
    }
}
