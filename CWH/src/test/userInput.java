package test;
class myEmployee{
    private String dept;
    private String name;
    public void setDept(String dept){
        this.dept = dept;
    }
    public String getDept(){
        return dept;
    }
    public void setName(){

    }
    public myEmployee(String deprt){
        dept = deprt;
    }
}
public class userInput {
    public static void main(String[] args) {
        myEmployee emp1 = new myEmployee("it");
//        emp1.setDept("fin");
        System.out.println(emp1.getDept());

    }
}
