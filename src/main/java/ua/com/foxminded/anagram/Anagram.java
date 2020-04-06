package ua.com.foxminded.anagram;

import java.util.Stack;

public class Anagram {

    private Stack<Character> extractLetters(String inputString) {
        Stack<Character> reversedLetters = new Stack<Character>();

        for (char symbol : inputString.toCharArray()) {
            if (Character.isLetter(symbol)) {
                reversedLetters.push(symbol);
            }
        }

        return reversedLetters;
    }

    private String composeString(String inputString, Stack<Character> reversedLetters) {
        StringBuilder output = new StringBuilder();

        for (char symbol : inputString.toCharArray()) {
            if (Character.isLetter(symbol)) {
                output.append(reversedLetters.pop());
            } else {
                output.append(symbol);
            }
        }

        return output.toString();
    }

    public String reverseLetters(String inputString) {

        if (inputString == null) {
            throw new IllegalArgumentException("Inputs data cannot be null.");
        }

        Stack<Character> reversedLetters = extractLetters(inputString);
        String outputString = composeString(inputString, reversedLetters);

        return outputString;
    }

}
