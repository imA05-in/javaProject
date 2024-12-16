package test;

import java.util.Random;

public class pin {

    public static void main(String[] args) {
    Random random = new Random();
    int pin = random.nextInt(9000)+1000;
        System.out.println(pin);
    }
}
