package Package3;
class Details{
    String name;
    static String School;
    public void Print(){
        System.out.println(name+" "+School);
    }
}
public class Student {
    public static void main(String[] args) {
Details details1 = new Details();
Details details2 = new Details();
        details1.name = "abc";
        details1.School = "kv";
        details2.name = "abcd";
        details2.School = "idk";
        details1.Print();
    }

}
