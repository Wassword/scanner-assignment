import java.util.Scanner;
public class Superhero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Let's write a story about a superhero.");
        System.out.print("Who is the hero of our story? ");

        String hero = sc.nextLine();
        System.out.print("What is their superpower?");

        String superpower = sc.nextLine();
        System.out.println("Here is the story:");
        System.out.println("There once was a superhero named " + hero + ", who had the power of " + superpower + "move at incredible speeds");
        System.out.println("As they grew older, " + hero + " saw that the world needed them.");
        System.out.println(hero + " used their ability to " + superpower + " to save the world.");

        sc.close();
    }
}
