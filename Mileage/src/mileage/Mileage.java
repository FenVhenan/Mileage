package mileage;

import java.util.Scanner; // Needed for Scanner class

/**
 * This program will calculate mileage.
 */

public class Mileage
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read from the keyboard.
        Scanner keyboard = new Scanner(System.in);
        
        // Identifier declarations
        double miles; // miles driven
        double gallons; // gallons used
        double mpg; // how many miles per gallon
        
        // Display the prompts and get input.
        System.out.print("How many miles have you driven?    ");
        miles = keyboard.nextDouble();
        System.out.print("How many gallons did you use?    ");
        gallons = keyboard.nextDouble();
        
        // Perform the calculations.
        mpg = miles / gallons;
        
        // Display results.
        System.out.println(mpg + "mpg");
    }
}