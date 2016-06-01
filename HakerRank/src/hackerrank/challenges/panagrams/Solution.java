package hackerrank.challenges.panagrams;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/pangrams
 * @author bxj62
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String out = "pangram";

		String sentence = in.nextLine().toLowerCase();
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		boolean[] alphabet2 = { false, false, false, false, false, false, false, false, false, false, false, 
				false, false, false, false, false, false, false, false, false, false, false, false, false, false, false };

		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) != ' ') {
				if (alphabet.indexOf(sentence.charAt(i)) > -1) {
					alphabet2[alphabet.indexOf(sentence.charAt(i))] = true;
				}
			}
		}

		for (int i = 0; i < alphabet2.length; i++) {
			if (alphabet2[i] == false) {
				out = "not pangram";
			}
		}

		System.out.println(out);
		in.close();
	}
}