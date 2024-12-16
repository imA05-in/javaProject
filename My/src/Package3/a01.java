package Package3;
interface if1{
    int age = 18;
}
interface if2{
    String name = "idk";
}
interface if1_2 extends if1,if2{
    public void print();
}
interface if3 extends if1{
//    String name;
}
public class a01 implements if1_2 {
    public void print(){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        a01 a01 = new a01();
        a01.print();
    }
}
