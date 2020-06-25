package pokus;

import java.util.Arrays;

public class MaxProductOfThree {

	public int solution(int[] A) {

		if (A.length == 3) return (A[0] * A[1] * A[2]);

		Arrays.parallelSort(A);

		int len = A.length;

		int result1 = A[len - 1] * A[len - 2] * A[len - 3];
		int result2 = A[0] * A[1] * A[len - 1];
		if (result2 > result1) return result2;
		return result1;
	}

}
