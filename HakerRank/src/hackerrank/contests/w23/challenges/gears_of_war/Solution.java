package hackerrank.contests.w23.challenges.gears_of_war;

import java.util.*;
/**
 * https://www.hackerrank.com/contests/w23/challenges/gears-of-war
 * @author bxj62
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int q = Integer.parseInt(in.nextLine());

		ArrayList<String> out = new ArrayList<String>();
		while (q-- > 0) {
			int n = Integer.parseInt(in.nextLine());

			if (n % 2 == 0) {
				out.add("Yes");
			} else {
				out.add("No");
			}

		}
		
		for(String o :out){
			System.out.println(o);
		}

		in.close();
	}
}