package test.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import practice.AcronymNumbers;

class AcronymNumbersTest {
	private AcronymNumbers acronymNumbers = new AcronymNumbers();

	@Test
	void test1() {
		int input[] = { 15, 51, 321, 231, 222, 123 };

		int result = acronymNumbers.solution(input);
		Assertions.assertEquals(4, result);
	}

	@Test
	void test2() {
		int input[] = { 1, 1, 3, 9, 9, 2041, 231, 4102, 2235, 3522, 2532 };

		int result = acronymNumbers.solution(input);
		Assertions.assertEquals(6, result);
	}

	@Test
	void test3() {
		int input[] = { 12, 21, 102001, 77, 201001 };

		int result = acronymNumbers.solution(input);
		Assertions.assertEquals(2, result);
	}

}
