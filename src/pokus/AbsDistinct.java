package pokus;

import java.util.Arrays;

public class AbsDistinct {

	public int solution(int[] A) {

		if (A.length == 1) return 1;

		for (int i = 0; i < A.length; i++) {
			if (A[i] < 0) {
				A[i] = Math.abs(A[i]);
			} else {
				break;
			}
		}

		Arrays.parallelSort(A);

		int distinct = 1;
		for (int i = 0; i < (A.length - 1); i++) {
			if (A[i] != A[i + 1]) distinct++;
		}

		return distinct;
	}

}
