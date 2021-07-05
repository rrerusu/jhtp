package org.erusu.jhtp.chapter3.exercises;

public class Invoice {

	// Declare private variables
	private String partNum, partDesc;
	private int qty;
	private double price;
	
	// Constructor to initialize all variables
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		partNum = partNumber;
		partDesc = partDescription;
		qty = quantity;
		price = pricePerItem;
	}

	// get method for partNum
	public String getPartNumber() {
		return partNum;
	}
	
	// set method for partNum
	public void setPartNumber(String partNumber) {
		partNum = partNumber;
	}
	
	// get method for partDesc
	public String getPartDescription() {
		return partDesc;
	}
	
	// set method for partDesc
	public void setPartDescription(String partDescription) {
		partDesc = partDescription;
	}
	
	// get method for qty
	public int getQuantity() {
		return qty;
	}
	
	// set method for qty
	public void setQuantity(int quantity) {
		qty = quantity;
	}
	
	// get method for price
	public double getPrice() {
		return price;
	}
	
	// set method for price
	public void setPrice(double pricePerItem) {
		price = pricePerItem;
	}
	
	// calculate invoice amount
	public Double getInvoiceAmount() {
		double value;
		if(qty <= 0 || price <= 0) {
			value = 0.0;
		} else {
			value = qty * price;
		}
		return value;
	}
	
}