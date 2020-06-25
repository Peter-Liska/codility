package pokus;

import java.util.Arrays;

public class Distinct {

	public int solution(int[] A) {

		if (A.length == 0) return 0;
		if (A.length == 1) return 1;

		Arrays.parallelSort(A);

		int distinct = 1;
		for (int i = 0; i < (A.length - 1); i++) {
			if (A[i] != A[i + 1]) distinct++;
		}

		return distinct;
	}

}
