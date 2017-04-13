package hackerrank.challenges.grading;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/grading
 * 
 * @author bryan
 *
 */

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		ArrayList<Integer> results = new ArrayList<Integer>();
		for (int a0 = 0; a0 < n; a0++) {
			int grade = in.nextInt();

			int tens = grade/10*10;
			
			int ones = grade - tens;
			//System.out.println(ones);
			
			if(ones>5){
				tens+=10;
			}else{
				tens+=5;
			}
						

			if (grade < 38) {
				results.add(grade);
			}else if(tens-grade<3){
				results.add(tens);
			}else{
				results.add(grade);
			}
		}
		
		for(Integer r:results){
			System.out.println(r);
		}
		in.close();
	}
}
