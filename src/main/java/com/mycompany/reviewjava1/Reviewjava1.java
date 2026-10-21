/*
 * Program 1
 * Conversion: Centimeters (CM) to Inches
 */

package com.mycompany.reviewjava1;
 import java.util.Scanner;

public class Reviewjava1 {
    
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter cm: ");
        double cm = input.nextDouble();

        double inch = cm / 2.54;

        System.out.println("Inch = " + inch);
    }
}
    

