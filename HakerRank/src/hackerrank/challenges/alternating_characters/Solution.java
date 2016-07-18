package hackerrank.challenges.alternating_characters;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/alternating-characters
 * 
 * @author bxj62
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int j = 0; j < n; j++) {
			String word = in.next();

			char last = '0';
			char curr = '0';

			int del = 0;
			for (int i = 0; i < word.length() - 1; i++) {
				last = word.charAt(i);
				curr = word.charAt(i + 1);

				if (last == curr) {
					del++;
				}

			}
			System.out.println(del);
		}

		in.close();
	}
}