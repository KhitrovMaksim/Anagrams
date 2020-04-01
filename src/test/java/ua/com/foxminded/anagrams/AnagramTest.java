package ua.com.foxminded.anagrams;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

    @Test
    public void test() {
        Anagram reverse = new Anagram();

        assertEquals("o!!!lleH", reverse.reverseLetters("H!!!ello"));
    }

}
