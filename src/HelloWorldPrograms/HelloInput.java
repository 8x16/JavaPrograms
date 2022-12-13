package HelloWorldPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloInput {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What is your name? ");
        String name = br.readLine();
        br.close();
        System.out.print("Hi " + name.strip() + ", Welcome to Java");
    }
}
