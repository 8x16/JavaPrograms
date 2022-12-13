import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hi, What is you name..: ");
        String name = input.nextLine();
        name = name.strip();
        System.out.println("###########################################################");
        System.out.println("Hi " + name + ", Welcome to Java, Let's change the world");
        System.out.println("###########################################################");
        input.close();
    }
}