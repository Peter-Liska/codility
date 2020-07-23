package lessons;

public class FrogJmp {

	public int solution(int X, int Y, int D) {
		int diff = Y - X;
		int div = diff / D;
		if ((X + (div * D)) == Y) {
			return div;
		}
		return div + 1;
	}
}
