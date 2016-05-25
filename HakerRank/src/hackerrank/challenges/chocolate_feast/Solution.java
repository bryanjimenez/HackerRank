package hackerrank.challenges.chocolate_feast;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/chocolate-feast
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
            int c = in.nextInt();
            int m = in.nextInt();
            
            out.add(n/c+ chocolates(m,n/c));
            
        }
        
        for(int o:out){
        	System.out.println(o);
        }
        in.close();
    }
    
    public static int chocolates(int M, int wrappers){
    	if(wrappers<M){
    		return 0;
    	}else{
    		// wrappers from chocolates obtained free + wrappers left over
    		return wrappers/M+chocolates(M,wrappers/M+wrappers%M);
    	}
    }
}
