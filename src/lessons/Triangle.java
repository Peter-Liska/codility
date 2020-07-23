package pokus;

import java.util.Arrays;

public class Triangle {

	public int solution(int[] A) {
		if (A.length < 3) return 0;

		Arrays.parallelSort(A);

		boolean found = false;
		for (int i = 0; i < (A.length - 2); i++) {
			if (A[i] > 0) {
				if ((A[i] == A[i + 1]) && (A[i] == A[i + 2]) && (A[i + 2] == A[i + 1])) {
					found = true;
					break;
				} else {
					if (A[i] + A[i + 1] > A[i + 2]) {
						if (A[i] + A[i + 2] > A[i + 1]) {
							if (A[i + 1] + A[i + 1] > A[i]) {
								found = true;
								break;
							}
						}
					}
				}
			}
		}

		if (found) return 1;
		return 0;
	}

}
