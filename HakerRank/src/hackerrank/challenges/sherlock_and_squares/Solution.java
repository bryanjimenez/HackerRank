package hackerrank.challenges.sherlock_and_squares;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/sherlock-and-squares
 * 
 * @author bxj62
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		List<Integer> out = new ArrayList<Integer>();
		for (int a0 = 0; a0 < t; a0++) {
			int a = in.nextInt();
			int b = in.nextInt();

			int count = 0;

			double a1 = Math.sqrt(a);
			double b1 = Math.sqrt(b);

			for (int i = (int) a1; i <= b1; i++) {
				if (i * i >= a && i * i <= b) {
					count++;
				}
			}
			out.add(count);
			// System.out.println(count);

		}

		for (int o : out) {
			System.out.println(o);
		}
		in.close();
	}
}