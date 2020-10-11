
package test.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import practice.Synonyms;

class SynonymsTest {
	private Synonyms synonyms = new Synonyms();

	@Test
	void test1() {
		String[][] dictionary = { { "big", "large" }, { "large", "huge" }, { "small", "little" }, { "apple", "banana" } };
		String[][] test = { { "same", "same" }, { "big", "huge" }, { "huge", "big" }, { "apple", "peach" }, { "big", "tall" }, { "peach", "PEACH" } };
		boolean[] result = { true, true, true, false, false, true };

		boolean[] ret = synonyms.solution(dictionary, test);

		Assertions.assertEquals(result.length, ret.length);
		for (int i = 0; i < result.length; i++) {
			Assertions.assertEquals(result[i], ret[i]);
		}
	}

	@Test
	void test2() {
		String[][] dictionary = { { "wood", "FORest" }, { "meadoW", "PrAirIe" }, { "WOOD", "Lumber" }, { "lumber", "forest" }, { "lumber", "forest" } };
		String[][] test = { { "wood", "lumber" }, { "meadow", "fire" } };
		boolean[] result = { true, false };

		boolean[] ret = synonyms.solution(dictionary, test);

		Assertions.assertEquals(result.length, ret.length);
		for (int i = 0; i < result.length; i++) {
			Assertions.assertEquals(result[i], ret[i]);
		}
	}

	@Test
	void test3() {
		String[][] dictionary = {};
		String[][] test = { { "wood", "LUMBER" }, { "mEADOw", "fire" } };
		boolean[] result = { false, false };

		boolean[] ret = synonyms.solution(dictionary, test);

		Assertions.assertEquals(result.length, ret.length);
		for (int i = 0; i < result.length; i++) {
			Assertions.assertEquals(result[i], ret[i]);
		}
	}

	@Test
	void test4() {
		String[][] dictionary = {};
		String[][] test = {};
		boolean[] result = {};

		boolean[] ret = synonyms.solution(dictionary, test);

		Assertions.assertEquals(result.length, ret.length);
	}

	@Test
	void test5() {
		String[][] dictionary = { { "magic", "WaTCH" }, { "uNdeRDog", "EartH" }, { "EArTh", "caKE" }, { "UnIforM", "baLance" }, { "BALancE", "ABILity" }, { "UnifORM", "uNIfORM" }, { "maNagER", "WaTcH" },
				{ "MaNagER", "MaNAGeR" }, { "FaKe", "EaRth" }, { "BAlance", "CAKe" }, { "AbIliTY", "uNiFOrm" }, { "UNdErdoG", "magiC" } };
		String[][] test = { { "Magic", "MagIc" }, { "Cake", "eArth" }, { "aBIlITy", "abiLiTY" }, { "watCh", "UniFoRM" }, { "CAke", "FaKe" }, { "FAkE", "watCh" }, { "MagIC", "abIlitY" },
				{ "uNIfoRm", "AbIlITY" }, { "baLAnCe", "eaRtH" }, { "bAlANCE", "MANAGER" } };
		boolean[] result = { true, true, true, true, true, true, true, true, true, true };

		boolean[] ret = synonyms.solution(dictionary, test);

		Assertions.assertEquals(result.length, ret.length);
		for (int i = 0; i < result.length; i++) {
			Assertions.assertEquals(result[i], ret[i]);
		}
	}

}