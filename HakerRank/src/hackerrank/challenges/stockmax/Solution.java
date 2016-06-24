package hackerrank.challenges.stockmax;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * https://www.hackerrank.com/challenges/stockmax
 * 
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

			while (n-- > 0) {
				prices.add(in.nextInt());
			}


			int largestA;
			int largestB = prices.get(prices.size()-1);
			long profit =0;
			
			for (int i = prices.size() - 2; i > -1; i--) {
				if (prices.get(i) > largestB) {
					largestA = prices.get(i);
	            } else {	            	
	            	
	            	largestA = largestB;
	                profit += largestB - prices.get(i);

	            }
				largestB = largestA;
				
			}
			System.out.println(profit);

		}
		in.close();
	}
}