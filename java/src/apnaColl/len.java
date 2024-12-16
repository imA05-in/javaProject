package apnaColl;

import java.util.Scanner;

public class len {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string: ");
        String str = sc.nextLine();
        int n = 0;
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)==' ') {
                n = n + 1;
            }
        }
        System.out.println("length without spaces is "+(str.length() -n));
        System.out.println("length with spaces is: "+str.length());
    }
}
