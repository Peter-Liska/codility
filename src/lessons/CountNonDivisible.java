package lessons;

public class CountNonDivisible {

	public int[] solution(int[] A) {

		// If array length is 1
		if (A.length == 1) {
			int[] ret = { 0 };
			return ret;
		}

		// If array length is 2
		if (A.length == 2) {
			int[] ret = new int[2];
			if (A[0] % A[1] != 0) ret[0]++;
			if (A[1] % A[0] != 0) ret[1]++;
			return ret;
		}

		// array length > 2 ----------------------------------------------

		// Count all numbers
		int numbers[] = new int[(2 * A.length) + 1];
		for (int i = 0; i < A.length; i++) {
			numbers[A[i]]++;
		}

		// Count and search non divisors
		int allSmaller = 0;
		int allBigger = A.length;
		int nonDivisor[] = new int[(2 * A.length) + 1];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				allBigger = allBigger - numbers[i];
				nonDivisor[i] = allBigger;

				if (i > 5) {
					allSmaller = A.length - allBigger - numbers[i] - numbers[1];

					if (allSmaller > 0) {
						int stop = ((int) Math.sqrt(i));
						if ((stop * stop) == i) {
							allSmaller = allSmaller - numbers[stop];
						} else {
							stop++;
							if (stop > i) stop = i;
						}

						int j = 2;
						while (j < stop) {
							if (i % j == 0) {
								allSmaller = allSmaller - numbers[j];
								int partner = i / j;
								allSmaller = allSmaller - numbers[partner];
							}
							j++;
						}

						nonDivisor[i] += allSmaller;
					}

				} else if (i == 3) {
					nonDivisor[i] += numbers[2];
				} else if (i == 4) {
					nonDivisor[i] += numbers[3];
				} else if (i == 5) {
					nonDivisor[i] += numbers[2];
					nonDivisor[i] += numbers[3];
					nonDivisor[i] += numbers[4];
				}

			} // not empty data
		} // all data

		// Put non divisors to the right order
		int returnArray[] = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			returnArray[i] = nonDivisor[A[i]];
		}

		return returnArray;
	}

}
