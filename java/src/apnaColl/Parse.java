package apnaColl;

import java.util.Scanner;

public class Parse {
    public static void main(String[] args) {
//        String n = "123";
//        int x = Integer.parseInt(n);
//        System.out.println(x);
        int [][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                System.out.print("enter "+i+","+j+" elements");
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
