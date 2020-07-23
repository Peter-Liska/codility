package lessons;

public class MaxSliceSum {

	public int solution(int[] A) {

		int absoluteMax = A[0];
		int localMax = A[0];

		int nextSum = 0;
		int current = 0;

		for (int i = 1; i < A.length; i++) {
			current = A[i];
			nextSum = localMax + current;
			localMax = Math.max(current, nextSum);
			absoluteMax = Math.max(absoluteMax, localMax);
		}
		return absoluteMax;
	}

}
