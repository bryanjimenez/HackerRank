package hackerrank.challenges.funny_string;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/funny-string
 * @author bxj62
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();

		List<String> out = new ArrayList<String>();
		
		for(int i=0;i<n;i++){
			String word = in.next();
			
			boolean funny=true;
			int j=0;
			while(funny==true && j<word.length()-1){
				if(Math.abs(word.charAt(j+1)-word.charAt(j))!=Math.abs(word.charAt(word.length()-2-j)-word.charAt(word.length()-1-j))){
					funny=false;
				}
				j++;
			}
			out.add(funny?"Funny":"Not Funny");

		}
		
		for(String o:out){
			System.out.println(o);
		}

		in.close();
	}
}