package test;
class class2{
    class1 c1obj = new class1();
    int var1 = c1obj.var;
    public void getVar1(){
        System.out.println(var1);
    }
    public static void main(String[] args) {
//        System.out.println(var1);
//        getVar1();
    }
}
public class class1 {
     int var = 1;
}
