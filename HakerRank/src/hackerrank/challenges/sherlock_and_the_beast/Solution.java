package hackerrank.challenges.sherlock_and_the_beast;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * https://www.hackerrank.com/challenges/sherlock-and-the-beast
 * 
 * @author bxj62
 *
 */
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		List<String> answers = new ArrayList<String>();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();

			StringBuilder one = new StringBuilder(n);
			for (int i = 0; i < n; i++) {
				one.append("1");
			}
			String thing = one.toString();

			String answer = "-1";
			while (!thing.equals("")) {
				if (criteria(thing)) {
					answer = thing;
					break;
				} else {
					thing = decrement(thing);
				}
			}
			if (!answer.equals("-1")) {
				answers.add(answer.replace('0', '3').replace('1', '5'));
			} else {
				answers.add(answer);
			}
		}

		for (String a : answers) {
			System.out.println(a);
		}
		in.close();
	}

	private static boolean criteria(String a) {
		boolean answer = false;
		int len = a.length();
		int sum = 0;
		for (char c : a.toCharArray()) {
			if (c == '1') {
				sum++;
			}
		}
		if (sum % 3 == 0 && (len - sum) % 5 == 0) {
			answer = true;
		}
		return answer;
	}

	/**
	 * decrement a string representation of a binary number
	 * 
	 * @param s
	 * @return
	 */
	private static String decrement(String s) {
		int length = s.length();
		char[] d = s.toCharArray();

		if (s.indexOf('1') == -1) {
			return "";
		}

		for (int i = 0; i < length; i++) {
			if (d[length - (1 + i)] == '1') {
				d[length - (1 + i)] = '0';
				break;
			} else {
				d[length - (1 + i)] = '1';
			}
		}

		return new String(d);
	}
}
