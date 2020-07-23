package lessons;

public class MinPerimeterRectangle {

	public int solution(int N) {

		int perimeter = -1;

		int x = (int) Math.round(Math.sqrt(N));

		for (int i = 0; i < x; i++) {

			int a1 = x + i;
			int b1 = N / a1;
			int perimeter1 = 2 * (a1 + b1);
			int area1 = a1 * b1;

			int a2 = x - i;
			int b2 = N / a2;
			int perimeter2 = 2 * (a2 + b2);
			int area2 = a2 * b2;

			if ((area1 == N) && (area2 == N)) {
				if (perimeter1 < perimeter2) {
					perimeter = perimeter1;
				} else {
					perimeter = perimeter2;
				}
				break;
			}
			if (area1 == N) {
				perimeter = perimeter1;
				break;
			}
			if (area2 == N) {
				perimeter = perimeter2;
				break;
			}

		}

		return perimeter;
	}

}
