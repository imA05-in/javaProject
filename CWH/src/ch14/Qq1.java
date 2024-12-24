package ch14;

import java.util.Scanner;

public class Qq1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 56, 6};
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<=1;){
        System.out.println("enter array index.");
        int n = sc.nextInt();
            try {
                if (n < arr.length) {
                    System.out.println(arr[n]);
                    i = 1;
                    break;
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("failed due to: "+e);
                i = 0;
            }
        }
    }
}
