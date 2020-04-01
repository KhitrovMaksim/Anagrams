package ua.com.foxminded.anagram;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.com.foxminded.anagram.Anagram;

public class AnagramTest {

    @Test
    public void test() {
        Anagram reverse = new Anagram();

        assertEquals("o!!!lleH", reverse.reverseLetters("H!!!ello"));
    }

}
