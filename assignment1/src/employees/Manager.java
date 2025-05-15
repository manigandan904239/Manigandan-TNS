package employees;

public class Manager extends Employee {
    private String department;

    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public static void main(String[] args) {
        Manager manager = new Manager("raju", 101, 90000.00, "Sales");
        System.out.println("Manager Name: " + manager.getName());
        System.out.println("Manager ID: " + manager.getEmployeeId());
        System.out.println("Manager Salary: " + manager.getSalary());
        System.out.println("Manager Department: " + manager.getDepartment());
    }
}
