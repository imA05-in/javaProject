package ch11;

import java.util.Scanner;

interface SmartTVRemote{
    void turnON();
}
interface TVRemote extends SmartTVRemote{
//void turnON();
}
public class a06 {
    public static void main(String[] args) {
        TVRemote tvRemote = new TVRemote() {
            @Override
            public void turnON() {
                System.out.println("turns on tv");
            }
        };
    }
}
