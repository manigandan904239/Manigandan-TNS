package utilities;

import employees.Developer;
import employees.Manager;

public class AssignmentMain {

	    public static void main(String[] args) {
	        Manager manager = new Manager("raju", 1, 85000, "Sales");
	        Developer developer = new Developer("ajay", 2, 75000, "Java");

	        EmployeeUtilities.displayManagerInfo(manager);
	        System.out.println();
	        EmployeeUtilities.displayDeveloperInfo(developer);
	    }
	}


