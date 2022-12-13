package Programiz.Intro;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the First number: ");
            int firstNumber = input.nextInt();
            System.out.print("Enter the Second number: ");
            int secondNumber = input.nextInt();
            System.out.println("Sum of the numbers " + firstNumber + " and " + 
            secondNumber + " is " + (firstNumber + secondNumber));
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            System.out.println("#-#-#-#-#-#-#-#");
            System.out.println("Scanner closed");
        }
    }
}
