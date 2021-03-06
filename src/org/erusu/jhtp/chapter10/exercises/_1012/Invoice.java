package org.erusu.jhtp.chapter10.exercises._1012;

public class Invoice implements Payable {
	private final String partNumber;
	private final String partDescription;
	private int quantity;
	private double pricePerItem;

	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.setQuantity(quantity);
		this.setPricePerItem(pricePerItem);
	}

	// Accessor Methods
	public String getPartNumber() {
		return partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}



	// Modifier Methods
	public void setQuantity(int quantity) {
		if(quantity < 0)
			throw new IllegalArgumentException("Quantity must be >= 0");

		this.quantity = quantity;
	}

	public void setPricePerItem(double pricePerItem) {
		if(pricePerItem < 0.0)
			throw new IllegalArgumentException("Price per item must be >= 0");

		this.pricePerItem = pricePerItem;
	}



	// Overrides
	@Override
	public String toString() {
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%.2f",
			"invoice", "part number", getPartNumber(), getPartDescription(),
			"quantity", getQuantity(), "price per item", getPricePerItem());
	}

	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem();
	}
}
