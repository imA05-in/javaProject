package apnaColl;

import java.util.Scanner;

public class find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2, m = 3;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m;j++){
                System.out.println("enter " + i + j + " elements: ");
                arr[i][j] = sc.nextInt();
            }
        }
        int x = 4;
        for(int i = 0; i<n ;i++){
            for(int j = 0; j<m; j++){
                if(x == arr[i][j]){
                    System.out.print(x+" found at index: "+i+" "+j);
                }

            }        }
    }
}