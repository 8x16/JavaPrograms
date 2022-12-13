package Programiz.Intro;

import java.util.Scanner;

public class FindASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        int ascii = ch;
        System.out.println(ch + " in ASCII is " + ascii);
        // A is 65, a is 97
        input.close();
    }
}