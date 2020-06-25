package pokus;

import java.util.Arrays;

public class PermMissingElem {

	public int solution(int[] A) {
		if (A.length == 0) return 1;
		if (A.length == 1) {
			if (A[0] == 1) return 2;
			return 1;
		}

		Arrays.parallelSort(A);
		if (A[0] != 1) return 1;
		boolean found = false;
		int i = 1;
		while (i < (A.length)) {
			if (A[i] != (i + 1)) {
				found = true;
				break;
			}
			i++;
		}
		if (found) return A[i] - 1;
		return A.length + 1;
	}

}
