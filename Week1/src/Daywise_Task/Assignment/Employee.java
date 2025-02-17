package Assignment;

import java.util.*;

class Employee implements Comparable<Employee> {
    private int empid;
    private String firstname;
    private String lastname;

    public Employee(int empid, String firstname, String lastname) {
        this.empid = empid;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Getters
    public int getEmpid() { return empid; }
    public String getFirstname() { return firstname; }
    public String getLastname() { return lastname; }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.empid, other.empid);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return empid == employee.empid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empid);
    }
    @Override
    public String toString() {
        return String.format("Employee{empid=%d, firstname='%s', lastname='%s'}", empid, firstname, lastname);
    }
}