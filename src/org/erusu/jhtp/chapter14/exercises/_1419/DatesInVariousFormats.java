package org.erusu.jhtp.chapter14.exercises._1419;

import java.util.Scanner;

public class DatesInVariousFormats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String inputDate[],
            months[] = {"January", "February", "March", "April",
                        "May", "June", "July", "August", "September",
                        "October", "November", "December"};

        System.out.printf("Enter date in format mm/dd/yyyy: ");
        inputDate = input.nextLine().split("/");

        System.out.printf("%s %s, %s",
            months[Integer.parseInt(inputDate[0]) - 1],
            inputDate[1],
            inputDate[2]);

        input.close();
    }
}