package medium;

import java.util.Stack;

public class Balanced_Brackets {
	
	public static void main(String[] args) {
		String res = isBalanced("}([[{)[]))]{){}[");
		System.out.println(res);
	}
	
	/**
	 * {[()]}
	 * {[(])}
	 */
	public static String isBalanced(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
				case '(':
				case '[':
				case '{':
					stack.push(c);
					break;
				case ')':
					if (stack.isEmpty() || stack.pop() != '(') {
						return "NO";
					}
					break;
				case ']':
					if (stack.isEmpty() || stack.pop() != '[') {
						return "NO";
					}
					break;
				case '}':
					if (stack.isEmpty() || stack.pop() != '{') {
						return "NO";
					}
					break;
			}
		}
		return stack.isEmpty() ? "YES" : "NO";
	}
	
}
