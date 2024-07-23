import java.util.Scanner;

public class VariableInputs {

    public static void main(String[] args) {
        // Get used to doing this! First things first, create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of text: ");
        String text = scanner.nextLine();
        System.out.println("Enter an integer: ");
        int integer = scanner.nextInt();
        System.out.println("Enter a double: ");
        double value = scanner.nextDouble();


        System.out.println("Enter a Boolean value: ");
        boolean bool = scanner.nextBoolean();


        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + integer);
        System.out.println("Your double is " + value);
        System.out.println("Your boolean is " + bool);


        scanner.close();
    }
}
