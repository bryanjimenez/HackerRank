package hackerrank.challenges.apple_and_orange;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();

		int apple_count = 0, orange_count = 0;

		int[] apple = new int[m];
		for (int apple_i = 0; apple_i < m; apple_i++) {
			apple[apple_i] = in.nextInt();

			if (apple[apple_i] > -1) {
				if (s - a <= apple[apple_i] && t - a >= apple[apple_i]) {
					apple_count++;
				}
			}

		}
		int[] orange = new int[n];
		for (int orange_i = 0; orange_i < n; orange_i++) {
			orange[orange_i] = in.nextInt();

			if (orange[orange_i] < 1) {
				if (b - t <= -orange[orange_i] && b - s >= -orange[orange_i]) {
					orange_count++;
				}
			}
		}

		System.out.println(apple_count);
		System.out.println(orange_count);

	}
}