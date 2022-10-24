package oopPakage;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack<Character> head = new Stack<>();
		Stack<Character> tail = new Stack<>();

		String s = sc.next();

		for (int idx = 0; idx < s.length(); idx++) {
			Character i = s.charAt(idx);
			if (Character.isLetterOrDigit(i)) {
				head.push(i);
			} else if (i == '<') {
				if (!head.isEmpty()) {
					tail.push(head.peek());
					head.pop();
				}
			}

			else if (i == '>') {
				if (!tail.isEmpty()) {
					head.push(tail.peek());
					tail.pop();
				}
			}

			else if (i == '-') {
				if (!head.isEmpty()) {
					head.pop();
				}
			}
		}

		while (!head.isEmpty()) {
			tail.push(head.peek());
			head.pop();
		}

		while (!tail.isEmpty()) {
			System.out.print(tail.peek());
			tail.pop();
		}
	}
}
