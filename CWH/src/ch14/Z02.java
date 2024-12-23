package ch14;

import java.util.Scanner;

public class Z02 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter array of max index 5: ");
//        int [] arr1 = new int[5];
//        for(int i = 0;i<arr1.length;i++){
//            arr1[i] = sc.nextInt();
//        }
//        for(int i  = 0;i<arr1.length; i++){
//            System.out.println(arr1[i]);
       int [] arr = {1,2,3,4};
       int n = 0;
       int j = 9;
       try{
           int c = arr[j]/n;
           System.out.println(c);
       }
//       catch (Exception e){
//           System.out.println("failed to perform action due to: "+e);
//       }
       catch (ArithmeticException Ae){
           System.out.println("action failed due to: "+Ae);
       }
       catch (ArrayIndexOutOfBoundsException b){
           System.out.println("action failed due to: "+b);
       }
        }
    }
