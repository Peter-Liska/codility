package pokus;

public class Fish {

	public int solution(int[] A, int[] B) {

		if (A.length == 1) return 1;

		int zeros = 0;
		for (int i = 0; i < B.length; i++) {
			if (B[i] == 0) zeros++;
		}

		int counter = 0;
		if (zeros > (B.length / 2)) {

			int stop = A.length;
			for (int i = (B.length - 1); i >= 0; i--) {
				if (B[i] == 1) {
					boolean isLive = true;
					int fish = A[i];
					A[i] = -1;
					if (i == B.length - 1) {
						stop = A.length - 1;
						counter++;
					} else {
						for (int k = i + 1; k < stop; k++) {
							if (fish > A[k]) {
								A[k] = -1;
							} else {
								isLive = false;
								break;
							}
						}
						if (isLive) {
							stop = i;
							counter++;
						}
					}
				}
			}

			for (int i = 0; i < stop; i++) if (A[i] > -1) counter++;

		} else {

			int stop = -1;
			for (int i = 0; i < B.length; i++) {
				if (B[i] == 0) {
					boolean isLive = true;
					int fish = A[i];
					A[i] = -1;
					if (i == 0) {
						stop = 0;
						counter++;
					} else {
						for (int k = i - 1; k > stop; k--) {
							if (fish > A[k]) {
								A[k] = -1;
							} else {
								isLive = false;
								break;
							}
						}
						if (isLive) {
							stop = i;
							counter++;
						}
					}
				}
			}

			for (int i = A.length - 1; i > stop; i--) if (A[i] > -1) counter++;

		}

		return counter;
	}

}
