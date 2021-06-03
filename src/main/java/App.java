import java.util.Scanner;
/*
Mad libs are a simple game where you create a story template with blanks for words. You, or another player, then construct a list of words and place them into the story, creating an often silly or funny story as a result.

Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create.

Example Output
Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!
Constraints
Use a single output statement for this program.
If your language supports string interpolation or string substitution, use it to build up the output.
 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] arg){
        String noun = readNoun();
        String verb = readVerb();
        String adjective = readAdjective();
        String adverb = readAdverb();
        System.out.println(printOutput(noun, verb, adjective, adverb));
    }

    private static String readNoun(){
        System.out.println("Enter a noun:");
        return in.nextLine();
    }

    private static String readVerb(){
        System.out.println("Enter a verb:");
        return in.nextLine();
    }

    private static String readAdjective(){
        System.out.println("Enter an adjective:");
        return in.nextLine();
    }

    private static String readAdverb(){
        System.out.println("Enter an adverb:");
        return in.nextLine();
    }

    private static String printOutput(String n, String v, String adj, String adv){
        return "Do you " + v + " your " + adj + " " + n + " " + adv + "? That's hilarious!";
    }
}