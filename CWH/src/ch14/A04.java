package ch14;
import java.util.Scanner;

class TriesExpired extends Exception{
    @Override
    public String toString() {
        return "tries expired. :(";
    }
}
public class A04 {
    public static void main(String[] args) throws TriesExpired{
        int [] arr = {1,2,3,4,5};
        int flag = 1;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            System.out.println("enter array index.");
            int n = sc.nextInt();
            try{
                System.out.println("element at index "+n+" is "+arr[n]);
                break;
            }
            catch (Exception e){
                System.out.println("error due to: "+e);
            flag++;
            }
        }
            if(flag>=arr.length){
                throw new TriesExpired();
            }
    }
}
