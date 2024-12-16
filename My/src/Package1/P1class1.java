package Package1;

import Package2.P2class2;

public class P1class1 {
    public static void idk() {
        System.out.println("idk");
    }

    class P1class01 extends P1class1 {
        public static void idk() {
            System.out.println("ik");
        }
    }
    public static void main(String[] args) {
P2class2 pc2_1 = new P2class2();
        System.out.println(pc2_1.str);
//        System.out.println("accessing from class1 "+pc2_1.strD);
//        System.out.println(pc2_1.strD);
        idk();
    }
    class P1class02 extends P1class1{
        public static void main(String[] args) {
            System.out.println("hello ji mera naam chin chin chu");
        }
    }
}

