package hackerrank.challenges.gem_stones;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/gem-stones
 * @author bxj62
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		List<Character> dic = new ArrayList<Character>();
		List<String> words = new ArrayList<String>();
		while (n-- > 0) {
			String word = in.next();
			words.add(word);
			for(char c:word.toCharArray()){
				if(dic.indexOf(c)<0){
					dic.add(c);
				}
			}
		}
		
		int matches=0;
		for(char c :dic){
			
			int match =0;
			for(String w:words){
				if(w.indexOf(c)>-1){
					match++;
				}
			}
			
			if(match==words.size()){
				matches++;
			}
		}
		
		System.out.println(matches);
		
		in.close();
	}
}