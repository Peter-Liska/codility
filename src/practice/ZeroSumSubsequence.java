package practice;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubsequence {

	public boolean solution(int[] inputArray) {

		// Special cases
		if (inputArray.length == 0) return false;
		if (inputArray.length == 1) {
			if (inputArray[0] == 0) return true;
			return false;
		}

		// Other cases
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(0);

		int sum = 0;
		for (int actual : inputArray) {
			sum += actual;
			if (hashSet.contains(sum)) return true; // If sum was there before, we have found a treasure.
			hashSet.add(sum);
		}

		return false;
	}

}