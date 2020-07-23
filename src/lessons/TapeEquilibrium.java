package pokus;

public class TapeEquilibrium {

	public int solution(int[] A) {
		if (A.length == 2) {
			return Math.abs(A[0] - A[1]);
		}

		long totalSum = 0;
		for (int i = 0; i < A.length; i++) {
			totalSum += A[i];
		}

		long first = 0;
		long second = totalSum;
		long result = Integer.MAX_VALUE;

		for (int i = 0; i < (A.length - 1); i++) {
			first = first + A[i];
			second = totalSum - first;

			long resultTmp = Math.abs(first - second);
			if (resultTmp < result) {
				result = resultTmp;
			}
		}

		return (int) result;
	}
}
