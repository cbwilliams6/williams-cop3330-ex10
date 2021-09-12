package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christian Williams
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        final double taxRate = 0.055;

        boolean repeat = true;
        int numReps = 1;
        String repeatItem;
        double item;
        int itemQuantity;
        double subtotal = 0;

        while(repeat)
        {
            System.out.println("Enter the price of item " + numReps +": ");
            item = input.nextDouble();
            System.out.println("Enter the quantity of item " + numReps + ": ");
            itemQuantity = input.nextInt();
            repeatItem = input.nextLine(); // I have no idea why but this extra input is needed or else it just skips the next input on line 33???

            subtotal += (item * itemQuantity);

            System.out.println("Would you like to add another item? (yes or no): ");
            repeatItem = input.nextLine();
            if(repeatItem.equalsIgnoreCase("no") || repeatItem.equalsIgnoreCase("n")) {
                repeat = false;
            }
            numReps += 1;
        }

        double tax = subtotal * taxRate;
        double total = subtotal + tax;
        System.out.println("Subtotal: $" + String.format("%.2f", subtotal) + "\nTax: $" + tax + "\nTotal: $" + total);
    }
}
