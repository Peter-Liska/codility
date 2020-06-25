package pokus;

public class MaxCounters {

	public int[] solution(int N, int[] A) {

		int[] counters = new int[N];
		int max = 0;
		int maxFill = 0;

		for (int i = 0; i < A.length; i++) {
			int value = A[i];
			if (value > N) {
				maxFill = max;
			} else {
				int id = value - 1;
				if (counters[id] < maxFill) {
					counters[id] = maxFill;
				}
				counters[id]++;
				if (counters[id] > max) {
					max = counters[id];
				}
			}
		}

		for (int i = 0; i < counters.length; i++) {
			if (counters[i] < maxFill) {
				counters[i] = maxFill;
			}
		}

		return counters;
	}

}
