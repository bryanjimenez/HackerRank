package hackerrank.challenges.tutorial_intro;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/tutorial-intro
 * 
 * @author bxj62
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int val = in.nextInt();
		int size = in.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = in.nextInt();
			if (array[i] == val) {
				System.out.println(i);
			}
		}
		in.close();
	}
}