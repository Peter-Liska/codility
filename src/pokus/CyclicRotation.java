package pokus;

public class CyclicRotation {

	public int[] solution(int[] A, int K) {
		int N = A.length;
		if (N < 2) return A;

		int nK = K;
		if (N < nK) {
			nK = nK % N;
			if (nK == 0) return A;
		}

		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			if ((i + nK) < N) {
				B[i + nK] = A[i];
			} else {
				B[i + nK - N] = A[i];
			}
		}
		return B;
	}
}
