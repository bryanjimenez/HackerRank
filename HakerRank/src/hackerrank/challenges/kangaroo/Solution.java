package hackerrank.challenges.kangaroo;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();

		if (v1 > v2 && (x1 - x2) % (v2 - v1) == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		in.close();
	}
}
