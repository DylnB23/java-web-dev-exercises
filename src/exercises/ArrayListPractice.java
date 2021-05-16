package exercises;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void five(ArrayList<String> arr){
        for (String word: arr){
            if (word.length() == 5){
                System.out.println(word);
            }
        }
    }
    public static void main(String[] arr){
        ArrayList<String> words = new ArrayList<>();
            words.add("Never");
            words.add("Gonna");
            words.add("Give");
            words.add("You");
            words.add("Up");
            words.add("Never");
            words.add("Gonna");

            ArrayListPractice.five(words);
            }
        }

