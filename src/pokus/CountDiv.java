package pokus;

public class CountDiv {

	public int solution(int A, int B, int K) {

		if (K == 1) return (B - A) + 1;

		if (K > B) {
			if (A == 0) return 1;
			return 0;
		}

		int start = A;
		int zvysok = A % K;
		if (zvysok != 0) {
			start = A + (K - zvysok);
		}

		if (start > B) return 0;
		if (start == B) return 1;

		int counter = 1;
		int delta = B - start;
		counter = counter + (delta / K);

		return counter;
	}

}
