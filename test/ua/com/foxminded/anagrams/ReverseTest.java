package ua.com.foxminded.anagrams;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {

	@Test
	public void test() {
		
		assertEquals("o!!!lleH", Anagram.reverseOnlyLetters("H!!!ello"));
		
	}

}
