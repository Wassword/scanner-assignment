import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello there! How are you doing today?");
        String answer1 = sc.nextLine();
        System.out.println("Wow - Interesting! Tell me more!");
        String answer2 = sc.nextLine();

        System.out.println("Nice chatting with you! Goodbye!");
    }
}
