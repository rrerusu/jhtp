package org.erusu.jhtp_new.chapter3.exercises._0312;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int itemsPurchased;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int itemsPurchased, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.itemsPurchased = itemsPurchased;
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        return (itemsPurchased * pricePerItem < 0) ? 0 : itemsPurchased * pricePerItem;
    }

    public int getItemsPurchased() {
        return itemsPurchased;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setItemsPurchased(int itemsPurchased) {
        this.itemsPurchased = itemsPurchased;
    }

    public void setPartNumber(String partNum) {
        partNumber = partNum;
    }

    public void setPartDescription(String partDesc) {
        partDescription = partDesc;
    }

    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
}
