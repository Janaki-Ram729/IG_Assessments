package Assignment;

import java.io.IOException;
import java.util.Scanner;

public class CityStateTest {
    public static void main(String[] args) {
        CityStateMap cityStateMap = new CityStateMap();
        Scanner scanner = new Scanner(System.in);
        try {
            cityStateMap.loadFromFile("C:\\Users\\JanakiramKilumu\\OneDrive - Insight Global, LLC\\Desktop\\CityState.txt");
            System.out.println("City-State pairs loaded from file successfully.");
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }

        while (true) {
            System.out.println("\n ----------City-State Mapping Menu --------");
            System.out.println("1. Get State for a City");
            System.out.println("2. Get All Cities");
            System.out.println("3. Get All States");
            System.out.println("4. Get Cities for a State");
            System.out.println("5. Add New City-State Pair");
            System.out.println("6. Delete All Cities for a State");
            System.out.println("7. Display All City-State Pairs");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter city name: ");
                    String city = scanner.nextLine();
                    System.out.println("State: " + cityStateMap.getState(city));
                    break;
                case 2:
                    System.out.println("All Cities: " + cityStateMap.getAllCities());
                    break;
                case 3:
                    System.out.println("All States: " + cityStateMap.getAllStates());
                    break;
                case 4:
                    System.out.print("Enter state name: ");
                    String state = scanner.nextLine();
                    System.out.println("Cities in " + state + ": " + cityStateMap.getCitiesForState(state));
                    break;
                case 5:
                    System.out.print("Enter city name: ");
                    String newCity = scanner.nextLine();
                    System.out.print("Enter state name: ");
                    String newState = scanner.nextLine();
                    cityStateMap.addCityState(newCity, newState);
                    System.out.println("City-State pair added successfully.");
                    break;
                case 6:
                    System.out.print("Enter state name: ");
                    String delState = scanner.nextLine();
                    cityStateMap.deleteCitiesForState(delState);
                    System.out.println("All cities for " + delState + " deleted.");
                    break;
                case 7:
                    cityStateMap.displayMap();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}