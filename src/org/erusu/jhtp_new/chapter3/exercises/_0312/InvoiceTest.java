package org.erusu.jhtp_new.chapter3.exercises._0312;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Invoice potato = new Invoice("001", "POTATO", 10, 5000000);

        System.out.printf("Cost of 10 potatoes = %.2f", potato.getInvoiceAmount());

        input.close();
    }
}