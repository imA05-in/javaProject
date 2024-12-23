package ch14;

public class Z091 {
    public static void main(String[] args) {
        int a = 500;
        int b = 0;
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("action failed due to: "+e);
        }
        System.out.println("hi");
    }
}
