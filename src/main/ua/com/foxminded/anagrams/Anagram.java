package ua.com.foxminded.anagrams;

import java.util.Stack;

public class Anagram {

	private static Stack<Character> getReverseLettersOnly (String inputString) {
        Stack<Character> reverseLettersOnly = new Stack<Character>();
        
        for (char symbolFromInputString: inputString.toCharArray()) {
            if (Character.isLetter(symbolFromInputString)) {
                reverseLettersOnly.push(symbolFromInputString);
            }
        }
        
        return reverseLettersOnly;
	}
	
	private static String sortLetters(String inputString, Stack<Character> reverseLettersOnly) {
		StringBuilder output = new StringBuilder();
		
        for (char symbolFromInputString: inputString.toCharArray()) {
            if (Character.isLetter(symbolFromInputString)) {
                output.append(reverseLettersOnly.pop());
            } else {
                output.append(symbolFromInputString);
            }
        }
        
        return output.toString();
	}
	
	public static String reverseOnlyLetters(String inputString) {
		String outputString;
		Stack<Character> reverseLettersOnly;
		
		reverseLettersOnly = getReverseLettersOnly(inputString);
		outputString = sortLetters(inputString, reverseLettersOnly);
		
		return outputString;
    }

}
