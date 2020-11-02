
package test.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import practice.Tetris;

class TetrisTest {
	private Tetris tetris = new Tetris();

	@Test
	void test01() {
		int[][] problem = {
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 1, 1, 0, 0 },
				{ 1, 1, 1, 0, 0, 0 },
				{ 1, 1, 1, 0, 0, 0 },
				{ 1, 1, 1, 0, 0, 0 } };

		Assertions.assertEquals(true, tetris.solution(problem));
	}

	@Test
	void test02() {
		int[][] problem = {
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 } };

		Assertions.assertEquals(true, tetris.solution(problem));
	}

	@Test
	void test03() {
		int[][] problem = {
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 1, 1, 1, 0 },
				{ 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 1, 1, 1, 1, 0, 0 } };

		Assertions.assertEquals(false, tetris.solution(problem));
	}

	@Test
	void test04() {
		int[][] problem = {
				{ 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 1, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0 },
				{ 1, 1, 0, 1, 0, 0 } };

		Assertions.assertEquals(false, tetris.solution(problem));
	}

	@Test
	void test05() {
		int[][] problem = {
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0 } };

		Assertions.assertEquals(true, tetris.solution(problem));
	}

	@Test
	void test06() {
		int[][] problem = {
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0 },
				{ 1, 1, 1, 0, 1, 0 },
				{ 1, 1, 1, 1, 1, 1 } };

		Assertions.assertEquals(true, tetris.solution(problem));
	}

	@Test
	void test07() {
		int[][] problem = {
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0 },
				{ 1, 1, 0, 0, 0, 0 },
				{ 1, 1, 1, 0, 0, 0 },
				{ 1, 1, 0, 0, 0, 0 } };

		Assertions.assertEquals(true, tetris.solution(problem));
	}

	@Test
	void test08() {
		int[][] problem = {
				{ 0, 0, 0, 0, 1, 1 },
				{ 0, 0, 0, 0, 1, 1 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 1, 1, 1, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 1 } };

		Assertions.assertEquals(true, tetris.solution(problem));
	}

	@Test
	void test09() {
		int[][] problem = {
				{ 0, 0, 0, 0, 1, 1 },
				{ 0, 0, 0, 0, 1, 1 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0 },
				{ 1, 1, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 1 } };

		Assertions.assertEquals(true, tetris.solution(problem));
	}

	@Test
	void test10() {
		int[][] problem = {
				{ 0, 0, 0, 0, 1, 1 },
				{ 0, 0, 0, 0, 1, 1 },
				{ 0, 0, 1, 1, 0, 0 },
				{ 0, 1, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 1 } };

		Assertions.assertEquals(true, tetris.solution(problem));
	}

	@Test
	void test11() {
		int[][] problem = {
				{ 0, 0, 0, 0, 1, 1 },
				{ 0, 0, 0, 0, 1, 1 },
				{ 0, 0, 1, 1, 0, 0 },
				{ 0, 1, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 1, 1 } };

		Assertions.assertEquals(false, tetris.solution(problem));
	}

	@Test
	void test12() {
		int[][] problem = {
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 0, 0 },
				{ 0, 1, 1, 0, 0, 0 },
				{ 0, 1, 1, 0, 0, 0 },
				{ 0, 1, 1, 0, 0, 0 } };

		Assertions.assertEquals(true, tetris.solution(problem));
	}

	@Test
	void test13() {
		int[][] problem = {
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0 },
				{ 1, 1, 1, 0, 0, 0 },
				{ 1, 1, 1, 0, 0, 0 } };

		Assertions.assertEquals(true, tetris.solution(problem));
	}

	@Test
	void test14() {
		int[][] problem = {
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 1, 1, 0, 0 },
				{ 1, 1, 1, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0, 0 } };

		Assertions.assertEquals(true, tetris.solution(problem));
	}

	@Test
	void test15() {
		int[][] problem = {
				{ 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 1, 1, 1, 0 },
				{ 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 0, 0, 0 },
				{ 1, 1, 1, 0, 0, 0 } };

		Assertions.assertEquals(true, tetris.solution(problem));
	}
}