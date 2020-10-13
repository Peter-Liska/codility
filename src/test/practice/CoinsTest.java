
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

}