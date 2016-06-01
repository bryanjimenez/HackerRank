package hackerrank.challenges.bear_and_workbook;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/bear-and-workbook
 * 
 * @author bxj62
 *
 */
public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();

		int page = 0;
		int special = 0;

		for (int a = 0; a < n; a++) {
			int p = in.nextInt();

			page++;
//			System.out.println("chapter "+(a+1) +" page: "+ page);

			for (int i = 0; i < p; i++) {
				if (i + 1 == page) {
					special++;
				}
				if ((i + 1)%t == 0 && i+1<p) {
					page++;
				}
			}
//			System.out.println("chapter "+(a+1) +" s: "+ special);

		}
		System.out.println(special);
		in.close();
	}

}