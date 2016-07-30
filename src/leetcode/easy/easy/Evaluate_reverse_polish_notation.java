package leetcode.easy.easy;


import java.util.Stack;

public class Evaluate_reverse_polish_notation {

	public static void main(String[] args) {
		String[] tokens = new String[] { "2", "1", "+", "3", "*" };
		System.out.println(evalRPN(tokens));
	}

	public static int evalRPN(String[] tokens) {
		String operatiors = "+-*/";
		Stack<String> stack = new Stack<String>();
		for (String t : tokens) {
			if (!operatiors.contains(t)) {
				stack.push(t);
			} else {
				int a = Integer.parseInt(stack.pop());
				int b = Integer.parseInt(stack.pop());
				int r = 0;

				switch (t) {
				case "+":
					stack.push(String.valueOf(a + b));
					break;
				case "-":
					stack.push(String.valueOf(b - a));
					break;
				case "*":
					stack.push(String.valueOf(a * b));
					break;
				case "/":
					stack.push(String.valueOf(b / a));
					break;
				}
			}

		}

		return Integer.valueOf(stack.pop());
	}
}
