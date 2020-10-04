package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubsequence {

	public boolean solution(int[] inputArray) {

		// Special cases
		if (inputArray.length == 0) return false;
		if (inputArray.length == 1) {
			if (inputArray[0] == 0) return true;
			return false;
		}

		// Other cases
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(0);

		int sum = 0;
		for (int actual : inputArray) {
			if (actual == 0) return true;

			sum += actual;
			if (hashSet.contains(sum)) return true; // If sum was there before, we have found a treasure.
			hashSet.add(sum);
		}

		return false;
	}

	public static void main(String[] args) {

		try {
			PrintWriter writer = new PrintWriter("test.out", "UTF-8");
			BufferedReader reader = new BufferedReader(new FileReader("test.in"));
			ZeroSumSubsequence zeroSumSubsequence = new ZeroSumSubsequence();

			String line = reader.readLine();
			int lineNum = Integer.parseInt(line);

			for (int k = 0; k < lineNum; k++) {
				line = reader.readLine();
				int size = Integer.parseInt(line);
				int arr[] = new int[size];

				line = reader.readLine();
				String[] strArr = line.split(" ");
				for (int i = 0; i < strArr.length; i++) {
					arr[i] = Integer.parseInt(strArr[i]);
				}

				if (zeroSumSubsequence.solution(arr)) {
					writer.println("yes");
				} else {
					writer.println("no");
				}
			}

			reader.close();
			writer.close();
		} catch (Exception ex) {
			System.out.println("Problem when reading file!");
		}

	}
}
