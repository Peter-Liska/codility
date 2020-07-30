package practice;

public class ThreeParts {

	public int solution(String S) {
		int sLen = S.length();

		// special cases
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
		// TODO: Try optimizing: Start loop from aPart (not 0) , and finish by sector2 (not sLen)
		int aPart = aCount / 3;
		boolean isSector1 = false;
		boolean isSector2 = false;
		boolean doneSector1 = false;
		int bCount1 = 0;
		int bCount2 = 0;
		int actual = 0;

		for (int i = 0; i < sLen; i++) {
			char c = S.charAt(i);
			if (c == 'a') {
				if (actual >= aPart) {
					actual = 0;
					doneSector1 = true;
				}
				actual++;
				isSector1 = false;
				isSector2 = false;
			} else {
				if (actual == aPart) {
					if (doneSector1) {
						isSector2 = true;
					} else {
						isSector1 = true;
					}
					if (isSector1) bCount1++;
					if (isSector2) bCount2++;
				}
			}
		}

		return (bCount1 + 1) * (bCount2 + 1);
	}

}
