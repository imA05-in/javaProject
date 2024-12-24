package ch14;

public class A02 {
        int fun(int a, int b){
            int c = a/b;
            return c;
        }
    public static void main(String[] args) {
            A02 a02 = new A02();

        try{
            System.out.println(a02.fun(2,0));
//            int c = a/b;
//            System.out.println(c);
        }
        catch (ArithmeticException ae){
            System.out.println("haha");
        }
        catch(IllegalArgumentException iae){
            System.out.println("hehe");
        }
    }
}
