package Programiz.Intro;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double firstNumber = input.nextDouble();
            System.out.print("Enter the second number: ");
            double secondNumber = input.nextDouble();
            System.out.println("-----Numbers before swapping----");
            System.out.println("First Number is " + firstNumber);
            System.out.println("Second Number is " + secondNumber);
            System.out.println();
            System.out.println("-----Numbers after swapping----");
            double temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
            System.out.println("First Number is " + firstNumber);
            System.out.println("Second Number is " + secondNumber);
            System.out.println("-----------------------------------------------------");
            System.out.println("Works only on primitives as they are called by value");
            System.out.println("-----------------------------------------------------");
            
        } catch (Exception e) {
            System.out.println("Exception Caught: " + e);
        }
    }
}