package ua.com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import ua.com.foxminded.anagram.Anagram;

public class AnagramTest {

    Anagram reverse;

    @BeforeEach
    void init() {
        reverse = new Anagram();
    }

    @Nested
    @DisplayName("ExtractLetters method")
    class ExtractLettersTest {

        @Test
        @DisplayName("When sets letters only")
        public void testExtractLetters() {
            Stack<Character> expectedLetters = new Stack<Character>();
            expectedLetters.push('s');
            expectedLetters.push('e');
            expectedLetters.push('t');
            Stack<Character> actualLetters = reverse.extractLetters("set");

            assertEquals(expectedLetters, actualLetters, "should return the same stacks");
        }

        @Test
        @DisplayName("When sets letters and symbols")
        public void testExtractLettersAndSymbols() {
            Stack<Character> expectedLetters = new Stack<Character>();
            expectedLetters.push('s');
            expectedLetters.push('t');
            Stack<Character> actualLetters = reverse.extractLetters("s!t");

            assertEquals(expectedLetters, actualLetters, "should return the same stacks without symbols");
        }
    }

    @Test
    @DisplayName("ComposeString method")
    public void testComposeString() {
        String expectedString = "t!es";
        Stack<Character> letters = new Stack<Character>();
        letters.push('s');
        letters.push('e');
        letters.push('t');
        String actualString = reverse.composeString("s!et", letters);
        
        assertEquals(expectedString, actualString, "should return the same strings");
    }

    @Test
    @DisplayName("ReverseLetters method")
    public void testReverseLetters() {
        String expectedString = "o!!!lleH";
        String actualString = reverse.reverseLetters("H!!!ello");
        assertEquals(expectedString, actualString, "should return the same strings");
    }

}
