package ch14;

import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = 4, b = 5;
        int [] arr = {1,2,3,4,5,6,7,8,9};
       int arr1[] = new int[5];
//        System.out.println("enter array elements(5)");
//       for(int i = 0;i<arr1.length;i++){
//           arr1[i] = sc.nextInt();
//       }
        try{
            int c =  a/0;
        }
        catch (Exception e){
            System.out.println("error due to: "+e );
        }
        finally{
            System.out.println("this is fnally");
        }

    }
}
