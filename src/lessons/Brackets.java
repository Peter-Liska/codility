package pokus;

import java.util.Stack;

public class Brackets {

	public int solution(String S) {

		if (S.length() == 0) return 1;
		if ((S.length() % 2) == 1) return 0;

		boolean isOk = true;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				if (stack.empty()) {
					isOk = false;
					break;
				}
				char left = stack.pop();
				if ((left == '(') && (c != ')')) {
					isOk = false;
					break;
				}
				if ((left == '[') && (c != ']')) {
					isOk = false;
					break;
				}
				if ((left == '{') && (c != '}')) {
					isOk = false;
					break;
				}
			}
		}

		if (isOk) {
			if (!stack.empty()) isOk = false;
		}

		if (isOk) return 1;
		return 0;
	}
}
