package hackerrank.challenges.find_digits;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/find-digits
 * @author bxj62
 *
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        List<Integer> out = new ArrayList<Integer>();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            
            String s = Integer.toString(n);
            int count =0;
            
            for(char c : s.toCharArray()){
            	
            	if(c!='0' && n%(Integer.parseInt(""+c))==0){
            		count++;
            	}
            }
            out.add(count);
            
        }
        
        for(int o :out){
        	System.out.println(o);
        }
        
        in.close();
    }
}
