package Programiz.Intro;

import java.util.Scanner;

public class AddTwoFloats {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first float: ");
            float firstFloat = input.nextFloat();
            System.out.print("Enter second float: ");
            float secondFloat = input.nextFloat();
            System.out.println("The sum of floats " + firstFloat + " and " + 
            secondFloat + " is " + (firstFloat + secondFloat));
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            System.out.println("------------------------------------------------");
            System.out.println("try-with-resources will close scanner by itslef");
            System.out.println("------------------------------------------------");
        }
    }
}
