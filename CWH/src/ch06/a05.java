package ch06;

import java.util.Scanner;

public class a05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int n = sc.nextInt();
        System.out.println(n);
        int [] arr = new int[n];
        int [] arr1 = new int[n];
        //array input
        System.out.println("enter array elements: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //array reverse
        for(int i = n-1;i>=0;i--){
            arr1[i] = arr[n-(i+1)];
        }
        //reversed array print
        for(int i = 0;i<n;i++){
        System.out.print(arr1[i]);
        }
    }
}
