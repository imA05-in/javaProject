package test;

class employee {
    private String name;

    public void setName(String name) {
        this.name = name;
        name1();
    }

    public String getName() {
        return name;
    }

    public String name1() {
        if (name.charAt(0) != 'A') {
            System.out.println("name doesnt start with A");
            name = null;
        }
        return name;
    }
}

public class emp {
    public static void main(String[] args) {
        String namee = "JUJU";
        employee emp1 = new employee();
        emp1.setName(namee);
        System.out.println(emp1.getName());

    }
}