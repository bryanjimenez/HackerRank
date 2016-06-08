package hackerrank.challenges.the_love_letter_mystery;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/the-love-letter-mystery
 * @author bxj62
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		while (n-- > 0) {
			String word = in.next();
			
			int ops=0;
			for(int i=0; i<word.length()/2;i++){
				char left = word.charAt(i);
				char right = word.charAt(word.length()-1-i);
				
				while(left!=right){
					if(left<right){
						right--;
					}else{
						left--;
					}
					ops++;
				}
			}
			System.out.println(ops);
			
		}
		in.close();
	}
}