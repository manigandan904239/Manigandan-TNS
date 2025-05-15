package employees;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public static void main(String[] args) {
        // Creating a Developer object
        Developer developer = new Developer("ajay", 102, 80000.00, "Java");

        // Displaying developer information
        System.out.println("Developer Name: " + developer.getName());
        System.out.println("Developer ID: " + developer.getEmployeeId());
        System.out.println("Developer Salary: " + developer.getSalary());
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }
}
