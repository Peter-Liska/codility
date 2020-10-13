package practice;

public class Coins {

	public boolean solution(int coins) {

		if (coins == 0) return false;
		if (coins == 1) return true;
		if (coins == 2) return false;
		if (coins == 3) return true;

		boolean[] win = new boolean[coins + 1];
		win[0] = true;
		win[1] = true;
		win[2] = false;
		win[3] = true;

		for (int i = 4; i <= coins; i++) {
			for (int k = 1; k * k <= i; k++) {

				int square = k * k;
				if (i - square == 0 || !win[i - square]) {
					win[i] = true;
					break;
				}
			}
		}

		return win[coins];
	}

}
