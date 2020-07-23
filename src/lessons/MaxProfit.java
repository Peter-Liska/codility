package pokus;

public class MaxProfit {

	public int solution(int[] A) {

		if (A.length < 2) return 0;

		// new delta array
		int delta[] = new int[A.length];
		delta[0] = 0;
		for (int i = 1; i < A.length; i++) {
			delta[i] = A[i] - A[i - 1];
		}

		// MaxSliceSum program copy for delta---

		int absoluteMax = delta[0];
		int localMax = delta[0];

		int nextSum = 0;
		int current = 0;

		for (int i = 1; i < delta.length; i++) {
			current = delta[i];
			nextSum = localMax + current;
			localMax = Math.max(current, nextSum);
			absoluteMax = Math.max(absoluteMax, localMax);
		}

		if (absoluteMax > 0) return absoluteMax;

		return 0;
	}

}
