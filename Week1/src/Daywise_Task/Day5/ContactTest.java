package Day5;

import java.time.LocalDate;
import java.util.Scanner;

public class ContactTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactStack contactStack = new ContactStack(5); 

        while (true) {
            System.out.println("\n----- Contact Stack Menu -----");
            System.out.println("1. Push Contact");
            System.out.println("2. Pop Contact");
            System.out.println("3. Display Stack");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter First Name: ");
                        String firstName = scanner.nextLine();

                        System.out.print("Enter Middle Name: ");
                        String middleName = scanner.nextLine();

                        System.out.print("Enter Last Name: ");
                        String lastName = scanner.nextLine();

                        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
                        LocalDate dob = LocalDate.parse(scanner.nextLine());

                        System.out.print("Enter Gender (Male/Female): ");
                        String gender = scanner.nextLine();

                        System.out.print("Enter Mobile Number (10 digits): ");
                        String mobile = scanner.nextLine();

                        Contact contact = new Contact(firstName, middleName, lastName, dob, gender, mobile);
                        contactStack.push(contact);
                    } catch (StackFullException | InvalidContactException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Invalid input! Please enter valid data.");
                    }
                    break;

                case 2:
                    try {
                        Contact poppedContact = contactStack.pop();
                        System.out.println("Popped Contact: " + poppedContact);
                    } catch (StackEmptyException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    contactStack.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        }
    }
}