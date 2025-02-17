package Assignment;

import java.util.Objects;

public class Student {
    private int age;
    private String firstName;
    private String lastName;
    private Address address; 

    // Constructor
    public Student(int age, String firstName, String lastName, Address address) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Getters
    public int getAge() { return age; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public Address getAddress() { return address; }

    // Full Name
    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return getFullName().equals(student.getFullName()) && address.equals(student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), address);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (Age: " + age + ") - " + address;
    }
}