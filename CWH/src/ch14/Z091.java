package ch14;
class parent{
    String fun1(){
//        System.out.println("fun 1");
        return "fun 1";
    }
}
class child extends parent {
    @Override
    String fun1() {
        return super.fun1();
    }
}
public class Z091 {
    public static void main(String[] args) {
        child e = new child();
//        throw new child();
//        System.out.println();
        e.fun1();
    }
}
