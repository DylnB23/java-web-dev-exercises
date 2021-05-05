package exercises;
import java.util.Scanner;

public class Alice_In_Wonderland {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String firstSentence = "Alice was beginning to get very tired " +
                "of sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";

        System.out.println("Search for a word that is in the first sentence of " +
                "Alice in Wonderland: ");
        String searchTerm = input.nextLine().toLowerCase();

        if (firstSentence.toLowerCase().contains(searchTerm)) {
            System.out.println("That word is in the first sentence!");
        } else {
            System.out.println("Sorry, that word isn't in the first sentence.");
        }

        int index = firstSentence.indexOf(searchTerm);
        int length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = firstSentence.replace(searchTerm, "");
        System.out.println(modifiedSentence);

    }
}
