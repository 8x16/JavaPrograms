package Programiz.Intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserEnteredInteger {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Please enter a input: ");
            String number = br.readLine();
            System.out.println(number);
            // br.close(); // doesn't work, as once System.in is closed, it cannot be opened
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("User can enter anything, this is not a valid program");
            System.out.println("#######################################################");
        }
        
        Scanner input = new Scanner(System.in);
        try(input) { // try with resources, close automatically
            System.out.print("Please enter a number: ");
            /* if(input.hasNextInt()) {
                int number2 = input.nextInt();
                System.out.println("User entered: " + number2);
             */
            int number = input.nextInt();
            System.out.println("User entered: " + number);
        } catch (Exception ex){
            System.out.println(ex);
        } finally {
            System.out.println("User can enter only numbers, this is a valid program");
            System.out.println("#######################################################");
        }
    }
}