package Thursday_LAB_28_23;

//BillDisplay class
class BillDisplay 
{
	 // Display the bill
	 static void displayBill(Car car) {
	     System.out.println("\n=============== Bill ===============");
	     System.out.println("Car Owner: " + car.getOwnerName());
	     System.out.println("Car Details: " + car.getYear() + " " + car.getMake() + " " + car.getModel());
	     System.out.println(car.getBill());
	     System.out.println("Total Cost: Rs " + car.getTotalCost());
	     System.out.println("====================================");
	 }
}
