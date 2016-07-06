package hackerrank.contests.w21.challenges.lazy_sorting;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
				
		
		int i=-1;
		double p = Math.pow(n, i);
		double sum = 0;
		
		while(p>0){
			System.out.println(p);
			sum+=(-i)*p;
			i--;
			p = Math.pow(n, i);
		}
		System.out.println(sum);
		
		
	}
}
