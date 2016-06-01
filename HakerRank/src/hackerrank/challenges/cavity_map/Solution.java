package hackerrank.challenges.cavity_map;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/cavity-map
 * @author bxj62
 *
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String grid[] = new String[n];
        String result[] = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
            result[grid_i]=grid[grid_i];
        }
        
        for(int row=1;row<n-1;row++){
        	for(int col=1;col<n-1;col++){
        		int center = Integer.parseInt(""+grid[row].charAt(col));  
        		int top = Integer.parseInt(""+grid[row-1].charAt(col));  
        		int left = Integer.parseInt(""+grid[row].charAt(col-1));  
        		int bottom = Integer.parseInt(""+grid[row+1].charAt(col));  
        		int right = Integer.parseInt(""+grid[row].charAt(col+1));  
        		
        		if(center>top && center>left && center>bottom && center>right){
        			result[row]=result[row].substring(0, col)+"X"+result[row].substring(col+1);
        		}
        		
        	}
        	
        }
        
        for(String o :result){
        	System.out.println(o);
        }
        
        
        in.close();
    }
}
