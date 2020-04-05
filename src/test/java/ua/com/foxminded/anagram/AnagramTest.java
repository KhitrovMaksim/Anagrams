package ua.com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.com.foxminded.anagram.Anagram;

public class AnagramTest {

    Anagram reverse = new Anagram();

    @Test
    public void testShouldReverseLettrersOnly() {
        String expectedString = "o!!!lleH";
        String actualString = reverse.reverseLetters("H!!!ello");
        assertEquals(expectedString, actualString, "should return the same strings");
    }

}
