package utilities;

import employees.Developer;
import employees.Employee;
import employees.Manager;

public class EmployeeUtilities {

    public static void displayEmployeeInfo(Employee employee) {
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + employee.getSalary());
    }

    public static void displayManagerInfo(Manager manager) {
        displayEmployeeInfo(manager);
        System.out.println("Department: " + manager.getDepartment());
    }

    public static void displayDeveloperInfo(Developer developer) {
        displayEmployeeInfo(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }
}
