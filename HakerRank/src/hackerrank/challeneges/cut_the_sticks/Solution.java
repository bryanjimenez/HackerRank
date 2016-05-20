package hackerrank.challeneges.cut_the_sticks;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/cut-the-sticks
 * @author bxj62
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];

		List<Integer> out = new ArrayList<Integer>();
		int min = Integer.MAX_VALUE;

		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
			if (arr[arr_i] < min) {
				min = arr[arr_i];
			}
		}

		int zeros = 0;

		while (zeros < arr.length) {
			int cuts = 0;
			//System.out.println(min);
			int nextMin = Integer.MAX_VALUE;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0) {
					cuts++;

					arr[i] = arr[i] - min;

					if (arr[i] > 0) {
						if (nextMin > arr[i]) {
							nextMin = arr[i];
						}
					} else {
						zeros++;
					}
				}
			}
			min = nextMin;
			out.add(cuts);

		}

		for (int o : out) {
			System.out.println(o);

		}

		in.close();
	}
}
