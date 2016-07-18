package hackerrank.challenges.caesar_cipher;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/caesar-cipher-1
 * 
 * @author bxj62
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt()%26;

		for (int i = 0; i < n; i++) {

				char orig = s.charAt(i);
				char next=orig;
				
				if (s.charAt(i) > 64 && s.charAt(i) < 91){
					next = (char) (orig+k);
					if(next>90){
						next=(char)(next-26);
					}					
				}else if(s.charAt(i) > 96 && s.charAt(i) < 123){
					next = (char) (orig+k);
					if(next>122){
						next=(char)(next-26);
					}
				}

				System.out.print("" + (char) (next));
			
		}
		in.close();
	}
}
