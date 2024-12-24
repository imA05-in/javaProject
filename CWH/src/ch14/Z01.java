package ch14;

public class Z01 {
    public static void main(String[] args) {
         class Myexcption extends Exception{
             @Override
             public String toString() {
                 System.out.println("Error !");
                 return "tt";
             }
         }
         int a = 8;
         if(a<9){
             try{
             throw new Myexcption();
             }
             catch(Exception e){
                 e.toString();
             }

         }
    }
}
