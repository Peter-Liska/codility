package pokus;

public class BinaryGap {

	public static int calculateBinaryGap(int N) {

		String sBinary = Integer.toBinaryString(N);
		String sBinaryClean = sBinary.replaceAll("0+$", "");
		String[] parts = sBinaryClean.split("1+");
		int max = 0;
		for (int i = 0; i < parts.length; i++) {
			int length = parts[i].length();
			if (length > max) max = length;
		}

		return max;
	}
}
