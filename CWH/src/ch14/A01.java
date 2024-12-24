package ch14;
class RuntimeError extends Exception{
    @Override
    public String toString() {
        return "Runtime error";
    }
}
public class A01 {
    public static void main(String[] args) {
        try{
            //syntax error
//            int a = 0
        }
        catch (Exception e){
            System.out.println("action failed: "+e);
        }
        try {
            //runtime error
//            int a = 4;
//            int b = 0;
//            int c = a/b;
//            System.out.println(c);
            throw new RuntimeError();
        }
        catch (RuntimeError runtimeError){
            System.out.println(runtimeError);
//            System.out.println("runtime error");
        }
        int [] arr = {1,2,3,4};
        try{
            System.out.println(arr[5]);
        }
        catch (Exception t){
            System.out.println("aciton failed: "+t);
        }
    }
}
