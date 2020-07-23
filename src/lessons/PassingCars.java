package pokus;

class PassingCars {

	public int solution(int[] A) {

		if (A.length < 2) return 0;

		int zeroCars = 0;
		int passing = 0;
		boolean returnNegative = false;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				zeroCars++;
			} else {
				passing += zeroCars;
			}
			if (passing > 1000000000) {
				returnNegative = true;
				break;
			}
		}

		if (returnNegative) return -1;
		return passing;
	}

}
