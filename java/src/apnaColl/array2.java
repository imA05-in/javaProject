package apnaColl;

import java.util.Scanner;


public class array2 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int [] arr = new int[5];
    for(int i = 0; i<5;i++){
        System.out.println("enter element");
        arr[i] = sc.nextInt();
    }
    for(int i = 0; i<5; i++){
        System.out.print(arr[i]+"   ");
    }
    }
}
