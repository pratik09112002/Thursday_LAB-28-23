package Thursday_LAB_28_23;

import java.util.Scanner;

//Extended Serviceable interface with pricing
interface Serviceable 
{
	 void performAdditionalService();
	 void carWash();
	 void oilChange();
	 void replaceTires();
	 void generalService();
}
	
	//Concrete class for Car inheriting from Vehicle (Inheritance)
class Car implements Serviceable 
{
	private String ownerName;
	private String make;
	private String model;
	private int year;
	private String fuelType;
	private double totalCost;
	private String bill;
	
	 // Constructor
	 public Car(String ownerName, String make, String model, int year, String fuelType) 
	 {
	     this.ownerName = ownerName;
	     this.make = make;
	     this.model = model;
	     this.year = year;
	     setFuelType(fuelType); // Use the setter to enforce fixed fuel types
	     this.totalCost = 0.0;
	     this.bill = "";
	 }
	
	 // Setter for fuel type to enforce fixed fuel types
	 private void setFuelType(String fuelType) {
	     // Enforce fixed fuel types: petrol, diesel, electric
	     if ("petrol".equalsIgnoreCase(fuelType) || "diesel".equalsIgnoreCase(fuelType) || "electric".equalsIgnoreCase(fuelType)) 
	     {
	         this.fuelType = fuelType;
	     } 
	     else 
	     {
	         throw new IllegalArgumentException("Invalid fuel type. Choose from: petrol, diesel, electric.");
	     }
	 }
	
	 // General service method
	 public void service() 
	 {
	     System.out.println("Performing general service for " + year + " " + make + " " + model + " car.");
	 }
	
	 // Implementation of additional services (Polymorphism)
	 @Override
	 public void performAdditionalService() 
	 {
	     // Additional services specific to cars
	     oilChange();
	     carWash();
	     replaceTires();
	     generalService();
	 }
	
	 // Replace tires specific to cars
	 public void replaceTires() 
	 {
	     double cost = 600.0;
	     System.out.println("Replacing tires for " + year + " " + make + " " + model + " car. Cost: Rs " + cost);
	     totalCost += cost;
	     addToBill("Replace Tires", cost);
	 }
	
	 // Car wash specific to cars
	 public void carWash() 
	 {
	     double cost = 1000.0;
	     System.out.println("Washing car for " + year + " " + make + " " + model + ". Cost: Rs " + cost);
	     totalCost += cost;
	     addToBill("Car Wash", cost);
	 }
	
	 // Oil change specific to cars
	 public void oilChange() 
	 {
	     double cost = 400.0;
	     System.out.println("Changing oil for " + year + " " + make + " " + model + " car. Cost: Rs " + cost);
	     totalCost += cost;
	     addToBill("Oil Change", cost);
	 }
	
	 // General service specific to cars
	 public void generalService() {
	     double cost = 1500.0;
	     System.out.println("Performing general service for " + year + " " + make + " " + model + " car. Cost: Rs " + cost);
	     totalCost += cost;
	     addToBill("General Service", cost);
	 }
	
	 // Add service and cost to the bill
	 private void addToBill(String service, double cost) 
	 {
	     bill += service + ": Rs " + cost + "\n";
	 }
	
	 // Display the bill
	 public void displayBill() 
	 {
	     System.out.println("\n=============== Bill ===============");
	     System.out.println("Car Owner: " + getOwnerName());
	     System.out.println("Car Details: " + getYear() + " " + getMake() + " " + getModel());
	     System.out.println(getBill());
	     System.out.println("Total Cost: Rs " + getTotalCost());
	     System.out.println("====================================");
	 }
	
	 // Getter methods
	 public String getOwnerName() 
	 {
	     return ownerName;
	 }
	
	 public String getMake() {
	     return make;
	 }
	
	 public String getModel() 
	 {
	     return model;
	 }
	
	 public int getYear() 
	 {
	     return year;
	 }
	
	 public String getFuelType() 
	 {
	     return fuelType;
	 }
	
	 public double getTotalCost() 
	 {
	     return totalCost;
	 }
	
	 public String getBill() 
	 {
	     return bill;
	 }
}



