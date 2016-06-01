package hackerrank.challenges.insertionsort2;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/insertionsort2
 * 
 * @author bxj62
 *
 */
public class Solution {

	public static void insertionSortPart2(int[] ar) {
		// Fill up this function
		for (int i = 1; i < ar.length; i++) {

			int last = ar[i];
			boolean inserted = false;

			for (int j = i-1; j > -1; j--) {
				if (ar[j] > last) {
					ar[j + 1] = ar[j];
				} else {
					ar[j + 1] = last;
					inserted = true;
				}

				if (inserted == true) {
					break;
				}
			}
			if (inserted == false) {
				ar[0] = last;
			}
			
			printArray(ar);
		}

	}

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSortPart2(ar);
		in.close();
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
