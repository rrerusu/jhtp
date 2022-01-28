package org.erusu.jhtp_new.chapter3.examples;

// import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green");
        Account account2 = new Account("John Blue");

        System.out.printf("account1 name is: %s\n", account1.getName());
        System.out.printf("account2 name is: %s\n", account2.getName());

        // Scanner input = new Scanner(System.in);

        // Account myAccount = new Account();

        // System.out.printf("Initial name: %s\n\n", myAccount.getName());

        // System.out.println("Please enter the name: ");
        // String name = input.nextLine();
        // myAccount.setName(name);
        // System.out.println();

        // System.out.printf("Name in object myAccount is: \n%s\n", myAccount.getName());

        // input.close();
    }
}