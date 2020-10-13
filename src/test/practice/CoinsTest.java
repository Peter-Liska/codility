
package test.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import practice.Coins;

class CoinsTest {
	private Coins coins = new Coins();

	@Test
	void test1() {
		Assertions.assertEquals(true, coins.solution(1));
	}

	@Test
	void test2() {
		Assertions.assertEquals(false, coins.solution(2));
	}

	@Test
	void test4() {
		Assertions.assertEquals(true, coins.solution(4));
	}

	@Test
	void test5() {
		Assertions.assertEquals(false, coins.solution(5));
	}

	@Test
	void test25() {
		Assertions.assertEquals(true, coins.solution(25));
	}

	@Test
	void test30() {
		Assertions.assertEquals(true, coins.solution(30));
	}

	@Test
	void test5308() {
		Assertions.assertEquals(true, coins.solution(5308));
	}

	@Test
	void test718() {
		Assertions.assertEquals(true, coins.solution(718));
	}

	@Test
	void test3302() {
		Assertions.assertEquals(false, coins.solution(3302));
	}

	@Test
	void test923() {
		Assertions.assertEquals(false, coins.solution(923));
	}

	@Test
	void test3400() {
		Assertions.assertEquals(false, coins.solution(3400));
	}

	@Test
	void test3189() {
		Assertions.assertEquals(false, coins.solution(3189));
	}

	@Test
	void test204() {
		Assertions.assertEquals(false, coins.solution(204));
	}

	@Test
	void test6898() {
		Assertions.assertEquals(true, coins.solution(6898));
	}

	@Test
	void test8983() {
		Assertions.assertEquals(true, coins.solution(8983));
	}

	@Test
	void test386() {
		Assertions.assertEquals(true, coins.solution(386));
	}

	@Test
	void test4805() {
		Assertions.assertEquals(true, coins.solution(4805));
	}

}