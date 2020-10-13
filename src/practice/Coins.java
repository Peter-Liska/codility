package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

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

	public static void main(String[] args) {

		try {
			System.setProperty("line.separator", "\n");
			PrintWriter writer = new PrintWriter("test.out", "UTF-8");
			BufferedReader reader = new BufferedReader(new FileReader("test.in"));

			Coins coins = new Coins();
			String line = reader.readLine();
			while (line != null) {

				line = line.trim();
				if (!line.isEmpty()) {
					int test = Integer.parseInt(line);
					boolean result = coins.solution(test);
					if (result) {
						writer.println("Pat");
					} else {
						writer.println("Mat");
					}
				}
				line = reader.readLine();
			}

			reader.close();
			writer.close();
		} catch (Exception ex) {
			System.out.println("Problem when reading file!");
		}

	}

}
