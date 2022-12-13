package Programiz.Intro;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the dividend: ");
            double dividend = input.nextDouble();
            System.out.print("Enter the divisor: ");
            double divisor = input.nextDouble();
            System.out.print( dividend + " / " + divisor + " is " + (int)(dividend/divisor) + 
            " times with a remainder of " + (dividend % divisor));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}