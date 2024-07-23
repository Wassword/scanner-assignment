import java.util.Scanner;

public class VariableInputs {

    public static void main(String[] args) {
        // Get used to doing this! First things first, create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of text: ");
        String text = scanner.nextLine();
        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();
        System.out.print("Enter an double: ");
        double dbl = scanner.nextDouble();


        boolean bool = scanner.nextBoolean();
        System.out.print("Enter a Boolean value: ");


        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + integer);
        System.out.println("Your double is " + dbl);
        System.out.println("Your boolean is " + bool);


        scanner.close();
    }
}
