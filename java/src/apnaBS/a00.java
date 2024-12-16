package apnaBS;

import java.util.Scanner;

public class a00 {
    public static void main(String[] args) {
        System.out.println("enter a string" );
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.next());
        System.out.println(str);
        StringBuilder result = new StringBuilder("");
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                result = str.setCharAt(i,'i');
            }
            else{result = str.charAt(i); }
        }
    }

}
