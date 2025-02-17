package Assignment;

import java.util.*;

public class EmployeeTest{
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployees();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n------ Employee Sorting Menu ------");
            System.out.println("1. Sort by Employee ID");
            System.out.println("2. Sort by Firstname");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nEmployees sorted by Employee ID:");
                    employeeManager.displayEmployees(employeeManager.sortByEmpId());
                    break;
                case 2:
                    System.out.println("\nEmployees sorted by Firstname:");
                    employeeManager.displayEmployees(employeeManager.sortByFirstname());
                    break;
                case 3:
                    System.out.println("\nAll Employees:");
                    employeeManager.displayEmployees(employeeManager.getEmployees());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}