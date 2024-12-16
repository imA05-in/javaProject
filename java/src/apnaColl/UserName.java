package apnaColl;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email, uname="";
        System.out.println("enter email");
        email = sc.nextLine();
        System.out.println("email: "+ email);
        for(int i = 0; i< email.length(); i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                uname = uname + email.charAt(i);
            }
        }
                System.out.print("username: "+uname);
    }
}
