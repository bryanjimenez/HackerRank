package hackerrank.challenges.plus_minus;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/plus-minus
 * 
 * @author bxj62
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			// spaces
			int spaces = n - (i + 1);

			for (int j = 0; j < n; j++) {
				if (j < spaces) {
					System.out.print(" ");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		in.close();
	}
}
