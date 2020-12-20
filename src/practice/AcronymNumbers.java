package practice;

import java.util.Arrays;

public class AcronymNumbers {

	public int solution(int numbers[]) {
		Arrays.parallelSort(numbers);

		// Analyze digits
		int[][] digits = new int[numbers.length][11];
		for (int i = 0; i < numbers.length; i++) {
			int part = numbers[i];
			while (part > 0) {
				int digit = part % 10;
				digits[i][digit]++;
				digits[i][10]++;
				part = part / 10;
			}
		}

		// Acronyms counter
		int counter = 0;
		for (int i = 0; i < digits.length; i++) {

			for (int k = i + 1; k < digits.length; k++) {

				// check number of digits
				if (digits[i][10] == digits[k][10]) {
					int same = 0;

					for (int m = 0; m < 10; m++) {
						if (digits[i][m] == digits[k][m]) {
							same++;
						} else {
							break;
						}
					}
					if (same == 10) counter++;

				} else {
					break;
				}

			}

		}

		return counter;
	}

}
