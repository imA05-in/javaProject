package ch06;

import java.util.Scanner;

public class a02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int Array_size = sc.nextInt();

        int [] arr = new int[Array_size];


        System.out.println("enter array:");
        for(int i = 0;i<Array_size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter a number to look for: ");
        int n = sc.nextInt();

        for(int i = 0; i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("found at index: "+i);
                break;
            }
            else{
                continue;
            }
        }
    }
}
