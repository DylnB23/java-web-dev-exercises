package org.launchcode.java.countingcharacters;

import java.util.HashMap;
import java.util.Map;


public class Studio {

    public static void quote(String inputString) {

        HashMap<Character, Integer> characterCount = new HashMap<>();

        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if (characterCount.containsKey(c)) {
                characterCount.put(c, characterCount.get(c) + 1);
            } else {
                characterCount.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "If the product of two terms is zero then common sense says at " +
                "least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored " +
                "allowing that side of the equation to equal zero." +
                " Once you’ve done that, it’s pretty straightforward from there.";
        quote(str);
    }

}
