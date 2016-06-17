package hackerrank.challenges.stockmax;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * https://www.hackerrank.com/challenges/stockmax
 * @author bxj62
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt();

			List<Integer> prices = new ArrayList<Integer>();
			List<Integer> cost = new ArrayList<Integer>();

			while (n-- > 0) {
				prices.add(in.nextInt());
			}


			cost.add(0);
			
			for (int i = 1; i < prices.size(); i++) {
				cost.add(cost.get(i-1)+prices.get(i-1));
			}
			
			for (int i = prices.size()-1; i > -1 ; i--) {
				for(int j=i;j>-1;j--){
					System.out.print(j*prices.get(i)-cost.get(j)+" ");
				}
				System.out.println();
			}

		}
		in.close();
	}
}