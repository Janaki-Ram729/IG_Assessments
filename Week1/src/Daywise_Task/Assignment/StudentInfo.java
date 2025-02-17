package Assignment;
import java.util.HashSet;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        students.add(new Student(20, "Janu", "B", new Address("123 Street", "NKG", "AP", "10001")));
        students.add(new Student(21, "Shiv", "G", new Address("456 Dno", "KG", "KHM", "90001")));
        students.add(new Student(20, "Janu", "B", new Address("123 Street", "NKG", "AP", "10001"))); 

        System.out.println("\nStudent List:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nEnter Student Details:");
        System.out.print("First Name: ");
        String firstName = scanner.next();
        System.out.print("Last Name: ");
        String lastName = scanner.next();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Street: ");
        String street = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.next();
        System.out.print("State: ");
        String state = scanner.next();
        System.out.print("Zip Code: ");
        String zipCode = scanner.next();

        Address newAddress = new Address(street, city, state, zipCode);
        Student newStudent = new Student(age, firstName, lastName, newAddress);

        if (students.contains(newStudent)) {
            System.out.println("Student already exists! Duplicate not added.");
        } else {
            students.add(newStudent);
            System.out.println("Student added successfully.");
        }
        System.out.println("\nUpdated Student List:");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}