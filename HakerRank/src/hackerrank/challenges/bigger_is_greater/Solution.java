package hackerrank.challenges.bigger_is_greater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/bigger-is-greater
 * 
 * @author bxj62
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = Integer.parseInt(in.nextLine());

		for (int i = 0; i < n; i++) {

			char[] word = in.nextLine().toCharArray();

			boolean answer = false;

			for (int j = word.length - 2; j > -1; j--) {
				int least = findLeastLargest(word[j], j + 1, word);

				// swap with least in swap array
				// then fill rest with ordered array
				if (least != -1) {
					// swap
					char tmp = word[least];
					word[least] = word[j];
					word[j] = tmp;

					// sort after j+1
					sortMe(word, j+1);
					
					answer = true;
					break;
				}

			}
			if (answer) {
				printMe(word);
			} else {
				System.out.println("no answer");
			}
		}

		in.close();
	}

	public static void sortMe(char[] a, int index) {
		char[] b = new char[a.length - index];

		for (int i = index; i < a.length; i++) {
			b[i - index] = a[i];
		}

		Arrays.sort(b);

		for (int i = index; i < a.length; i++) {
			a[i] = b[i - index];
		}

	}

	public static void printMe(char[] b) {
		for (char c : b) {
			System.out.print(c);
		}
		System.out.println();
	}

	public static int findLeastLargest(char a, int start, char[] b) {
		int index = -1;

		int least = Integer.MAX_VALUE;

		for (int i = start; i < b.length; i++) {
			if (b[i] > a && b[i] - a < least) {
				index = i;
				least = b[i] - a;
			}
		}

		return index;
	}

}
