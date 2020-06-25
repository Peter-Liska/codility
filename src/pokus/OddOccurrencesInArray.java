package pokus;

import java.util.Arrays;

public class OddOccurrencesInArray {

	public int solution(int[] A) {

		if (A.length == 1) return A[0];

		Arrays.parallelSort(A);

		int i = 0;
		boolean found = false;
		while (i < (A.length - 1)) {
			if (A[i] != A[i + 1]) {
				found = true;
				break;
			}
			i = i + 2;
		}
		if (found) return A[i];
		return A[A.length - 1];
	}
}
