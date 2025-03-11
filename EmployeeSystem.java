class Employee {
    private static String companyName = "Tech Corp";

    private static int totalEmployees = 0;

    private final int id;

    // Instance variable to store the employee's name
    private String name;

    // Instance variable to store the employee's designation
    private String designation;

    // Constructor to initialize an employee object with ID, name, and designation
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++; // Incrementing the total employee count
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        if (this instanceof Employee) { // Checking if the current object is an instance of Employee
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

// Main class to test the Employee class
public class EmployeeSystem {
    public static void main(String[] args) {
        // Creating employee objects with ID, name, and designation
        Employee emp1 = new Employee(1, "Ankush", "Software Developer");
        Employee emp2 = new Employee(2, "Jashan", "Peon");

        // Displaying details of the first employee
        emp1.displayEmployeeDetails();

        // Displaying details of the second employee
        emp2.displayEmployeeDetails();

        // Displaying the total number of employees
        Employee.displayTotalEmployees();
    }
}
