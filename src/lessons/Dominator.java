package lessons;

import java.util.Arrays;

public class Dominator {

	public int solution(int[] A) {

		if (A.length == 0) return -1;
		if (A.length == 1) return 0;

		int original[] = new int[A.length];
		for (int k = 1; k < A.length; k++) {
			original[k] = A[k];
		}

		int half = A.length / 2;
		Arrays.parallelSort(A);

		boolean dominatorFound = false;
		int dominator = A[0];
		int dominatorCounter = 1;

		int i = 1;
		while (i < A.length) {
			if (dominator == A[i]) {
				dominatorCounter++;
				if (dominatorCounter > half) {
					dominatorFound = true;
					break;
				}
			} else {
				dominator = A[i];
				dominatorCounter = 1;
			}
			if ((dominatorCounter + (A.length - i)) < half) break;
			i++;
		}

		if (dominatorFound) {
			int j = 0;
			for (; j < A.length; j++) {
				if (dominator == original[j]) break;
			}
			return j;
		}

		return -1;
	}

}
