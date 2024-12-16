package ch06;

import java.util.Scanner;

public class a04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr2 = {{9,8,70},{6,5,4}};
        int [][] sum = new int[2][3];
        int [][] arr1 = { {1,2,3},{4,5,6}};
        for(int i = 0;i< 2;i++){
            for(int j = 0;j<3;j++){
               sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for(int i = 0;i<2;i++){
            for(int j = 0; j<3;j++){
        System.out.print(sum[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
