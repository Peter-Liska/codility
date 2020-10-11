package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;

public class Synonyms {

	public boolean[] solution(String[][] dictionary, String[][] problems) {

		boolean[] result = new boolean[problems.length];

		// Special cases
		if (dictionary.length == 0) return result;
		if (problems.length == 0) return result;

		// All to lower case.
		for (int i = 0; i < dictionary.length; i++) {
			dictionary[i][0] = dictionary[i][0].toLowerCase();
			dictionary[i][1] = dictionary[i][1].toLowerCase();
		}
		for (int i = 0; i < problems.length; i++) {
			problems[i][0] = problems[i][0].toLowerCase();
			problems[i][1] = problems[i][1].toLowerCase();
		}

		// Build dictionary
		ArrayList<HashSet<String>> hashSetList = new ArrayList<HashSet<String>>();

		// Add first
		HashSet<String> firstHashSet = new HashSet<String>();
		firstHashSet.add(dictionary[0][0]);
		firstHashSet.add(dictionary[0][1]);
		hashSetList.add(firstHashSet);

		for (int iD = 1; iD < dictionary.length; iD++) {

			boolean found = false;
			int iCombineTo = -1;
			ArrayList<Integer> remove = new ArrayList<Integer>();

			for (int iHS = 0; iHS < hashSetList.size(); iHS++) {

				HashSet<String> actual = hashSetList.get(iHS);

				if (!found) {

					if (actual.contains(dictionary[iD][0]) || actual.contains(dictionary[iD][1])) {
						actual.add(dictionary[iD][0]);
						actual.add(dictionary[iD][1]);
						found = true;
						iCombineTo = iHS;
					}

				} else {
					if (actual.contains(dictionary[iD][0]) || actual.contains(dictionary[iD][1])) {

						for (String str : actual) hashSetList.get(iCombineTo).add(str);
						remove.add(iHS);
					}
				}

			} // all hashSets

			// Remove duplicates
			if (remove.size() > 0) {
				for (int k = remove.size() - 1; k >= 0; k--) {
					hashSetList.remove(remove.get(k).intValue());
				}
			}

			// If new Synonyms, then add.
			if (!found) {
				HashSet<String> hashSet = new HashSet<String>();
				hashSet.add(dictionary[iD][0]);
				hashSet.add(dictionary[iD][1]);
				hashSetList.add(hashSet);
			}
		}

		// Solve problems
		for (int i = 0; i < result.length; i++) {

			if (problems[i][0].equals(problems[i][1])) {
				result[i] = true;
			} else {
				for (HashSet<String> actual : hashSetList) {
					if (actual.contains(problems[i][0])) {
						if (actual.contains(problems[i][1])) {
							result[i] = true;
						}
						break;
					}
				}
			}

		}

		return result;
	}

	public static void main(String[] args) {

		try {
			System.setProperty("line.separator", "\n");
			PrintWriter writer = new PrintWriter("example_big.out", "UTF-8");
			BufferedReader reader = new BufferedReader(new FileReader("example_big.in"));
			Synonyms synonyms = new Synonyms();

			String line = reader.readLine();
			int testNum = Integer.parseInt(line);

			for (int t = 0; t < testNum; t++) {

				// Read dictionary
				line = reader.readLine();
				int dictionaryNum = Integer.parseInt(line);
				String dictionary[][] = new String[dictionaryNum][2];
				for (int d = 0; d < dictionaryNum; d++) {
					line = reader.readLine();
					String[] strArr = line.split(" ");
					dictionary[d][0] = strArr[0];
					dictionary[d][1] = strArr[1];
				}

				// Read tests
				line = reader.readLine();
				int problemsNum = Integer.parseInt(line);
				String problems[][] = new String[problemsNum][2];
				for (int p = 0; p < problemsNum; p++) {
					line = reader.readLine();
					String[] strArr = line.split(" ");
					problems[p][0] = strArr[0];
					problems[p][1] = strArr[1];
				}

				// Write
				boolean[] results = synonyms.solution(dictionary, problems);

				for (boolean res : results) {
					if (res) {
						writer.println("synonyms");
					} else {
						writer.println("different");
					}
				}

			}

			reader.close();
			writer.close();
		} catch (Exception ex) {
			System.out.println("Problem when reading file!");
		}

	}
}
