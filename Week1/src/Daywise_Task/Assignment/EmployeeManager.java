package Assignment;

import java.util.*;

public class EmployeeManager {
    private Set<Employee> employees;
    public EmployeeManager() {
        this.employees = new HashSet<>();
    }

    public void addEmployees() {
        employees.add(new Employee(103, "Alia", "B"));
        employees.add(new Employee(101, "Bob", "Jr"));
        employees.add(new Employee(104, "Charlie", "Chaplin"));
        employees.add(new Employee(102, "Arjun", "s"));
        employees.add(new Employee(105, "Krishna", "Radha"));
        employees.add(new Employee(106, "Jess", "K")); 
    }

    // Sort employees by EmpID 
    public List<Employee> sortByEmpId() {
        List<Employee> sortedList = new ArrayList<>(employees);
        Collections.sort(sortedList);
        return sortedList;
    }

    // Sort employees by Firstname 
    public List<Employee> sortByFirstname() {
        List<Employee> sortedList = new ArrayList<>(employees);
        sortedList.sort(Comparator.comparing(Employee::getFirstname));
        return sortedList;
    }

    // Display the employees
    public void displayEmployees(List<Employee> empList) {
        for (Employee emp : empList) {
            System.out.println(emp);
        }
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }
}