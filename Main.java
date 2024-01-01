package Thursday_LAB_28_23;

import java.util.Scanner;

// Main class
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        CarServiceCenter serviceCenter = new CarServiceCenter("QuickService");

        Car car1 = createCar();

        int choice;
        do {
            System.out.println("\n1. Service Car");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    serviceCenter.performService(car1);
                    break;
                case 2:
                    System.out.println("Visit Again.");
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose the correct option.");
            }
        } while (choice != 2);

        scanner.close();
    }

    // Create a car with user input
    private static Car createCar() 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter Car Details:");
        System.out.print("Owner's Name: ");
        String ownerName = scanner.nextLine();

        System.out.print("Make: ");
        String make = scanner.nextLine();

        System.out.print("Model: ");
        String model = scanner.nextLine();

        System.out.print("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Prompt for fuel type from fixed options
        System.out.print("Fuel Type (petrol, diesel, electric): ");
        String fuelType = scanner.nextLine();

        return new Car(ownerName, make, model, year, fuelType);
    }
}

