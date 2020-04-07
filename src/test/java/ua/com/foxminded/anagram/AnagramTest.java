package ua.com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import ua.com.foxminded.anagram.Anagram;

public class AnagramTest {

    Anagram reverse = new Anagram();

    @Test
    public void reverseLetters_ThrowsException_IfInputIsNull() {

        assertThrows(IllegalArgumentException.class, () -> {
            reverse.reverseLetters(null);
        });
    }

    @Test
    public void reverseLetters_BlankString_IfInputIsBlankString() {

        assertEquals("", reverse.reverseLetters(""));
    }

    @Test
    public void reverseLetters_Space_IfInputIsSpace() {

        assertEquals(" ", reverse.reverseLetters(" "));
    }

    @Test
    public void reverseLetters_Spaces_IfInputIsSpaces() {

        assertEquals("   ", reverse.reverseLetters("   "));
    }

    @Test
    public void reverseLetters_ReverseLettersInLowerCase_IfInputIsLettersInlowerCase() {

        assertEquals("world", reverse.reverseLetters("dlrow"));
    }

    @Test
    public void reverseLetters_ReverseLettersInUpperCase_IfInputIsLettersInUpperCase() {

        assertEquals("HELLO", reverse.reverseLetters("OLLEH"));
    }

    @Test
    public void reverseLetters_ReverseLettersInFewWords_IfInputIsFewWords() {

        assertEquals("HELLO world", reverse.reverseLetters("dlrow OLLEH"));
    }

    @Test
    public void reverseLetters_ReverseLettersOnly_IfInputIsLettersWithDigitsAndSymbols() {

        assertEquals("H!!!ello111_>", reverse.reverseLetters("o!!!lleH111_>"));
    }

    @Test
    public void tesreverseLetters_ReverseLettersOnlyInFewWords_IfInputIsFewWordsWithDigitsAndSymbols() {

        assertEquals("H!!!ello123_> world", reverse.reverseLetters("d!!!lrow123_> olleH"));
    }

}
