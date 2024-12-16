package ch06;

import java.util.Scanner;

public class a01 {
    public static void main(String[] args) {
        float [] arr = new float[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 floats. ");
        for(int i = 0;i <arr.length;i++){
            arr[i] = sc.nextFloat();
        }
        System.out.println("array:");
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println("sum is: ");
        float n = 0;
        for (int i = 0;i<arr.length;i++){
            n = arr[i] + n;
        }
            System.out.println(n);
    }
}
