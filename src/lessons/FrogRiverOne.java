package lessons;

public class FrogRiverOne {

	public int solution(int X, int[] A) {

		if (A.length == 1) {
			if ((X == 1) && A[0] == 1) {
				return 0;
			} else {
				return -1;
			}
		}

		boolean bridge[] = new boolean[X + 1];

		long sumCheck = 0;
		long sum = 0;

		int i = 0;
		while (i < A.length) {
			int value = A[i];
			if (!bridge[value]) {
				bridge[value] = true;
				sum += value;
			}

			if (i < X) sumCheck += (i + 1);

			if (i >= (X - 1)) {
				if (sum == sumCheck) break;
			}

			i++;
		}
		if (i < A.length) {
			return i;
		}

		return -1;
	}

}
