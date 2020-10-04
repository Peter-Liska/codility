
package test.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import practice.ZeroSumSubsequence;

class ZeroSumSubsequenceTest {
	private ZeroSumSubsequence zeroSumSubsequence = new ZeroSumSubsequence();

	@Test
	void test1() {
		int[] test = { 2, 8, -9, 1 };
		Assertions.assertEquals(true, zeroSumSubsequence.solution(test));
	}

	@Test
	void test2() {
		int[] test = { 2, 1, 3, 4, -9, 6, 8, 9, -100000, 123132131 };
		Assertions.assertEquals(false, zeroSumSubsequence.solution(test));
	}

	@Test
	void test3() {
		int[] test = { -5, 8, 0, 4 };
		Assertions.assertEquals(true, zeroSumSubsequence.solution(test));
	}

	@Test
	void test4() {
		int[] test = { 0 };
		Assertions.assertEquals(true, zeroSumSubsequence.solution(test));
	}

	@Test
	void test5() {
		int[] test = { -5 };
		Assertions.assertEquals(false, zeroSumSubsequence.solution(test));
	}

	@Test
	void test6() {
		int[] test = {};
		Assertions.assertEquals(false, zeroSumSubsequence.solution(test));
	}

	@Test
	void test7() {
		int[] test = { 1, 2, 0 };
		Assertions.assertEquals(true, zeroSumSubsequence.solution(test));
	}

	@Test
	void test8() {
		int[] test = { 0, 1, 2, -1, -2 };
		Assertions.assertEquals(true, zeroSumSubsequence.solution(test));
	}

	@Test
	void test9() {
		int[] test = { -1, -2, 3, 8 };
		Assertions.assertEquals(true, zeroSumSubsequence.solution(test));
	}
}