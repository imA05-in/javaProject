package ch09;
class Employee{
    private int salary;

    public int getSalary() {
        return salary;
    }

    private String name;
    Employee(){
        salary = 10000;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class ch01 {
    public static void main(String[] args) {
    Employee emp1 = new Employee();
        System.out.println(emp1.getSalary());
        emp1.setName("emp1IsJuJu");
        System.out.println(emp1.getName());
    }
}
