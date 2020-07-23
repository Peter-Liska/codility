package lessons;

import java.util.Arrays;

public class MissingInteger {

	public int solution(int[] A) {

		Arrays.parallelSort(A);

		int min = 1;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				if (A[i] == min) {
					min = A[i] + 1;
				}
			}
		}
		return min;
	}

}
