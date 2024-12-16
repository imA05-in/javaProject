package apnaColl;

import java.util.Scanner;


public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("enter " + i + j + " element");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + "   ");
                }
                else{
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
    }
}