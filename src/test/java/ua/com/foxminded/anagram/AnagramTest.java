package ua.com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import ua.com.foxminded.anagram.Anagram;

public class AnagramTest {

    Anagram reverse = new Anagram();

    @Test
    public void testShouldReverseLettersOnly() {

        assertAll(() -> assertThrows(IllegalArgumentException.class, () -> {reverse.reverseLetters(null);}),
                  () -> assertEquals("", reverse.reverseLetters("")),
                  () -> assertEquals(" ", reverse.reverseLetters(" ")),
                  () -> assertEquals("   ", reverse.reverseLetters("   ")),
                  () -> assertEquals("world", reverse.reverseLetters("dlrow")),
                  () -> assertEquals("HELLO", reverse.reverseLetters("OLLEH")),
                  () -> assertEquals("HELLO world", reverse.reverseLetters("dlrow OLLEH")),
                  () -> assertEquals("H!!!ello111_>", reverse.reverseLetters("o!!!lleH111_>")),
                  () -> assertEquals("H!!!ello123_> world", reverse.reverseLetters("d!!!lrow123_> olleH")));

    }

}
