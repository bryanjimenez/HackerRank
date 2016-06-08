package hackerrank.challenges.bigger_is_greater;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * https://www.hackerrank.com/challenges/bigger-is-greater
 * @author bxj62
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			List<Character> word = new ArrayList<Character>();
			String w = in.nextLine();
			for (char c : w.toCharArray()) {
				word.add(c);
			}

			for(int j=word.size()-2;j>0;j--){
				word.get(j);

				for(int h=0;h<3;h++){
					
				}
				
				if (word.get(j) < word.get(j + 1)) {
					// swap with least in swap array
					// then fill rest with ordered array
				}
			}
		}

		in.close();
		return null;
	}
}
