package oops.Encapsulation;

class Employee {
    public String name;
    protected String email;
    private int salary;

    Employee(String name, String email, int salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println(this);
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}

class Hr {

    Employee emp;

    Hr(String name, String email, int salary) {
        this.emp = new Employee(name, email, salary);
    }

    public void setEmployeeSalary(int salary) {
        if (salary > 0) {
            emp.setSalary(salary);
            System.out.println("Salary Set Successfully");
        }
    }

    public int getEmployeeSalary() {
        return emp.getSalary();
    }

    public void getEmpDetails() {
        System.out.println("Name: " + emp.getName());
        System.out.println("email: " + emp.getEmail());
        System.out.println("salary: " + emp.getSalary());
    }

}

public class Organization {
    public static void main(String[] args) {

        Hr anuj = new Hr("tuhsar", "shitoletushar3132@gmail.com", 100000);

        anuj.setEmployeeSalary(500000);

        // System.out.println(anuj.getEmployeeSalary());
        

        anuj.getEmpDetails();
    }
}
