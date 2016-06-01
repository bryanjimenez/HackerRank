package hackerrank.challenges.lonely_integer;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/lonely-integer
 * @author bxj62
 *
 */
public class Solution {
	static int lonelyinteger(int[] a) {
		List<Integer> b = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			b.add(a[i]);
		}

		for (int i = 0; i < a.length; i++) {
			if (b.indexOf(a[i]) > -1) {
				b.remove(b.indexOf(a[i]));
				if (b.indexOf(a[i]) == -1) {
					return a[i];
				} else {
					b.remove(b.indexOf(a[i]));
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;

		int _a_size = Integer.parseInt(in.nextLine());
		int[] _a = new int[_a_size];
		int _a_item;
		String next = in.nextLine();
		String[] next_split = next.split(" ");

		for (int _a_i = 0; _a_i < _a_size; _a_i++) {
			_a_item = Integer.parseInt(next_split[_a_i]);
			_a[_a_i] = _a_item;
		}

		res = lonelyinteger(_a);
		System.out.println(res);
		in.close();
	}
}
