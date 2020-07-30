package practice;

public class ThreeParts {

	public int solution(String S) {
		int sLen = S.length();

		// special cases (3 or less)
		if (sLen < 3) return 0;
		if (sLen == 3) {
			if (S.charAt(0) == 'a') {
				if (S.charAt(1) == 'a') {
					if (S.charAt(2) == 'a') {
						return 1;
					}
				}
			}
			return 0;
		}

		// 'a' counter - is divisible by 3?
		int aCount = 0;
		for (int i = 0; i < sLen; i++) {
			char ch = S.charAt(i);
			if (ch == 'a') aCount++;
		}
		if (aCount % 3 > 0) return 0;

		// other cases
		boolean isSector1 = false;
		boolean isSector2 = false;
		boolean doneSector1 = false;
		boolean doneSector2 = false;

		int aPart = aCount / 3;
		int bCount1 = 0;
		int bCount2 = 0;
		int actual = 0;

		// TODO: Optimize: Try start loop from around aPart (not 0) + something like that at finish
		for (int i = 0; i < sLen; i++) {
			char c = S.charAt(i);
			if (c == 'a') {
				if (actual == aPart) {
					actual = 0;
					if (doneSector1) doneSector2 = true;
					doneSector1 = true;
				}
				isSector1 = false;
				isSector2 = false;
				actual++;
			} else {
				if (actual == aPart) {
					if (!doneSector1) isSector1 = true;
					if (!doneSector2 && doneSector1) isSector2 = true;
					if (isSector1) bCount1++;
					if (isSector2) bCount2++;
				}
			}
		}

		return (bCount1 + 1) * (bCount2 + 1);
	}

}