package Thursday_LAB_28_23;

import java.util.Scanner;

//Car Service Center class
class CarServiceCenter 
{
	private String name;
	
	 // Constructor
	 public CarServiceCenter(String name) 
	 {
	     this.name = name;
	 }
	
	 // Perform service for a car
	 public void performService(Car car) 
	 {
	     System.out.println("Welcome to " + name + " Service Center.");
	
	     int serviceChoice;
	     do {
	         System.out.println("\n1. Oil Change");
	         System.out.println("2. Car Wash");
	         System.out.println("3. Replace Tires");
	         System.out.println("4. General Service");
	         System.out.println("5. Finish Service");
	         System.out.print("Enter your choice: ");
	         serviceChoice = new Scanner(System.in).nextInt();
	
	         switch (serviceChoice) 
	         {
	             case 1:
	                 car.oilChange();
	                 break;
	             case 2:
	                 car.carWash();
	                 break;
	             case 3:
	                 car.replaceTires();
	                 break;
	             case 4:
	                 car.generalService();
	                 break;
	             case 5:
	                 BillDisplay.displayBill(car); // Display the bill at the end of the service
	                 PaymentProcessor.processPayment(car); // Process payment after displaying the bill
	                 System.out.println("Finishing service. Thank you!");
	                 break;
	             default:
	                 System.out.println("Invalid choice. Please choose correct choice.");
	         }
	     } while (serviceChoice != 5);
	 }
}

