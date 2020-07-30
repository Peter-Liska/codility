
package test.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import practice.ThreeParts;

/*
 * String contains only small English letters: a, b
 * Divide this string to 3 parts with same amount of a.
 * Return number of possible parts.
 */
class ThreePartsTest {
	private ThreeParts threeParts = new ThreeParts();

	@Test
	void test() {
		String testString;

		testString = "";
		Assertions.assertEquals(0, threeParts.solution(testString));

		testString = "a";
		Assertions.assertEquals(0, threeParts.solution(testString));

		testString = "aaa";
		Assertions.assertEquals(1, threeParts.solution(testString));

		testString = "aba";
		Assertions.assertEquals(0, threeParts.solution(testString));

		testString = "babaab";
		Assertions.assertEquals(2, threeParts.solution(testString));

		testString = "abaa";
		Assertions.assertEquals(2, threeParts.solution(testString));

		testString = "aaba";
		Assertions.assertEquals(2, threeParts.solution(testString));

		testString = "abaaa";
		Assertions.assertEquals(0, threeParts.solution(testString));

		testString = "ababa";
		Assertions.assertEquals(4, threeParts.solution(testString));

		testString = "aaaaaaaaabbaaaaaaaaabbaaaaaaaaa";
		Assertions.assertEquals(9, threeParts.solution(testString));

		testString = "bbbaaaaaaaaabbaaaaaaaaabbaaaaaaaaabbb";
		Assertions.assertEquals(9, threeParts.solution(testString));
	}

}