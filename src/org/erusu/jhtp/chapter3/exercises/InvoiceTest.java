package org.erusu.jhtp.chapter3.exercises;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		// instantiate objects
		Scanner input = new Scanner(System.in);
		Invoice myInvoice = new Invoice("1010", "cpu", 100, 299.99);
		
		// Declare variables
		String partNumber, partDescription;
		int quantity;
		double price;
		
		// display values in myInvoice
		System.out.printf("Part number: %s%nPart description: %s%nQuantity: %d%nPrice: %.2f%n%n",
						  myInvoice.getPartNumber(), myInvoice.getPartDescription(),
						  myInvoice.getQuantity(), myInvoice.getPrice());
		
		// get user input to change each value
		System.out.print("Enter part number: ");
		partNumber = input.nextLine();
		
		System.out.print("Enter part description: ");
		partDescription = input.nextLine();
		
		System.out.print("Enter quantity available: ");
		quantity = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter price of each item: ");
		price = Double.parseDouble(input.nextLine());
		
		// store the value in myInvoice
		myInvoice.setPartNumber(partNumber);
		myInvoice.setPartDescription(partDescription);
		myInvoice.setQuantity(quantity);
		myInvoice.setPrice(price);
		
		// display values in myInvoice
		System.out.printf("%nPart number: %s%nPart description: %s%nQuantity: %d%nPrice: $%.2f%n%n",
						  myInvoice.getPartNumber(), myInvoice.getPartDescription(),
						  myInvoice.getQuantity(), myInvoice.getPrice());
		
		// display invoice amount
		System.out.printf("Invoice amount: $%.2f%n", myInvoice.getInvoiceAmount());
		
		// close scanner
		input.close();

	}

}
