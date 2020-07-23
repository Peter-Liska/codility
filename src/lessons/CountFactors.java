package pokus;

public class CountFactors {

	public int solution(int N) {

		if (N == 1) return 1;
		if (N == 2) return 2;
		if (N == 3) return 2;
		if (N == 4) return 3;
		if (N == 5) return 2;
		if (N == 6) return 4;
		if (N == 7) return 2;
		if (N == 8) return 4;
		if (N == 9) return 3;

		int factors = 2; // 1 and N
		if (N % 2 == 0) factors += 2;
		if (N % 3 == 0) factors += 2;

		int stop = N / 3;
		int i = 4;
		while (i < stop) {
			if (N % i == 0) {
				factors++;
				if (N / i != i) {
					factors++;
				}
			}
			stop = N / i;
			i++;
		}

		return factors;
	}
}
