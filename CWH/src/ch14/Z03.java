package ch14;
class Exception1 extends Exception{
    Exception1(String s){
        System.out.println(s);
    }

    @Override
    public String getMessage() {
        return "errorrrrr.";
    }

    @Override
    public String toString() {
        return "toString error";
    }
}
public class Z03 {
//    int a  = 8;
    static class idk{

}
    public static void main(String[] args) {
        int a = 8;
        if (a < 99) {
            try{
            throw new Exception1("custom error");
            }
            catch (Exception1 e){
                System.out.println(e.getMessage());
                System.out.println(e);
            }
        }
    }
}

