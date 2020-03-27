package ua.com.foxminded.anagrams;

import java.util.Stack;

public class Reverse {

	public static String reverseOnlyLetters(String inputString) {
		Stack<Character> lettersOnly = new Stack<Character>();
		StringBuilder output = new StringBuilder();

		for (char symbolFromInputString : inputString.toCharArray()) {
			if (Character.isLetter(symbolFromInputString)) {
				lettersOnly.push(symbolFromInputString);
			}
		}

		for (char symbolFromInputString : inputString.toCharArray()) {
			if (Character.isLetter(symbolFromInputString)) {
				output.append(lettersOnly.pop());
			} else {
				output.append(symbolFromInputString);
			}
		}

		return output.toString();
	}

}
