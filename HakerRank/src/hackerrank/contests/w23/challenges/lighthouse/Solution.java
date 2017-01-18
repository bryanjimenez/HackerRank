package hackerrank.contests.w23.challenges.lighthouse;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * https://www.hackerrank.com/contests/w23/challenges/lighthouse
 * @author bxj62
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int q = Integer.parseInt(in.nextLine());

		String[] area = new String[q];
		int i =0;
		while(q-->0){
			area[i++] = in.nextLine(); 
		}
		
		
		for(i=0;i<area.length;i++){
			
			for(int j=0;j<area.length;j++){
				if(area[i].charAt(j)=='.'){
					//create a circle of increasing radii until you hit an obstacle, check if the radii is larger than the previous
					
				}
			}
		}
		
		
		
		
		
		for(String s:area){
			System.out.println(s);
		}
		
		in.close();
	}
}