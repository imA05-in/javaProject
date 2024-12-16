package ch8;
class  Employee{
int salary;
//StringBuilder obj_SB = new StringBuilder(name);
    String name;
    public String getName(){
        return name;
    }
    public void setName(String name_new){
        name = name_new;
    }
public int getSalary(){
//        System.out.println(salary);
        return salary;
    }
}
public class Emp {
    public static void main(String[] args) {
        Employee employee_obj = new Employee();
        employee_obj.setName("abhishek");
        employee_obj.salary = 78900;
        System.out.println(employee_obj.getName());
        System.out.println(employee_obj.getSalary());
    }
}
