package testtttttt;
interface a1 {
    int age = 8;
}
class a01 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("therad a01");
            i++;
        }
    }
}
class a002 implements Runnable{
    @Override
    public void run() {
        int j = 0;
        while (j < 1000) {
            System.out.println("thread a02.");
            j++;
        }
    }
}


class  idk {
    public static void print(){
        System.out.println("hello from idk");
    }
    int add = 4;
}
    public class a02 {
        public static void main(String[] args) {
            idk.print();
        a01 a1 = new a01();
        Thread t1 = new Thread(a1);
        t1.start();
        a002 a2 = new a002();
        Thread t2 = new Thread(a2);
        t2.start();
        }
    }
