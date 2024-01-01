package Thursday_LAB_28_23;

import java.util.Scanner;

//Class responsible for payment processing
class PaymentProcessor 
{
	 // Fixed OTP for payment verification
	 private static final String FIXED_OTP = "123456";
	
	 // Process payment after the bill is displayed
	 static void processPayment(Car car) 
	 {
	     // Payment section with multiple options
	     System.out.println("\nSelect a payment method:");
	     System.out.println("1. GPay");
	     System.out.println("2. PhonePe");
	     System.out.println("3. Paytm");
	     System.out.println("4. Cash");
	     System.out.print("Enter your choice: ");
	     int paymentChoice = new Scanner(System.in).nextInt();
	
	     switch (paymentChoice) 
	     {
	         case 1:
	             processGPayPayment(car);
	             break;
	         case 2:
	             processPhonePePayment(car);
	             break;
	         case 3:
	             processPaytmPayment(car);
	             break;
	         case 4:
	             processCashPayment(car);
	             break;
	         default:
	             System.out.println("Invalid payment method. Please choose a valid option.");
	     }
	 }
	
	 // Payment processing methods
	 private static void processGPayPayment(Car car) 
	 {
	     System.out.println("Please complete the payment using GPay. Scan the QR code or use the UPI ID provided.");
	
	     // OTP for GPay payment
	     enterAndValidateOTP("GPay");
	
	     System.out.println("Payment successful. Thank you!");
	 }
	
	 private static void processPhonePePayment(Car car) 
	 {
	   
	     System.out.println("Please complete the payment using PhonePe. Scan the QR code or use the PhonePe number provided.");
	  // OTP for PhonePe payment
	     enterAndValidateOTP("PhonePe");
	     System.out.println("Payment successful. Thank you!");
	 }
	
	 private static void processPaytmPayment(Car car) 
	 {
	     
	     System.out.println("Please complete the payment using Paytm. Scan the QR code or use the Paytm number provided.");
	  // OTP for Paytm payment
	     enterAndValidateOTP("Paytm");
	     System.out.println("Payment successful. Thank you!");
	 }
	
	 private static void processCashPayment(Car car) 
	 {
	     System.out.println("Please make the payment in cash at the service center counter.");
	     System.out.println("Payment successful. Thank you!");
	 }
	
	 // Method to enter and validate OTP
	 private static void enterAndValidateOTP(String paymentMethod) 
	 {
	     Scanner scanner = new Scanner(System.in);
	     System.out.print("Enter OTP for " + paymentMethod + " payment verification: ");
	     String enteredOTP = scanner.next();
	
	     if (!validateOTP(enteredOTP)) {
	         System.out.println("Invalid OTP. Payment verification failed.");
	         // You may choose to handle this differently, such as prompting for OTP again or cancelling the payment
	         System.exit(1); // Exit the program for simplicity in this example
	     }
	 }
	
	 // Method to validate OTP
	 private static boolean validateOTP(String enteredOTP) 
	 {
	     return enteredOTP.equals(FIXED_OTP);
	 }
}
