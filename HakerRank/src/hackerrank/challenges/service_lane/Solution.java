package hackerrank.challenges.service_lane;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/service-lane
 * @author bxj62
 *
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        
        List<Integer> out=new ArrayList<Integer>();
        
        for(int a0 = 0; a0 < t; a0++){
            int i = in.nextInt();
            int j = in.nextInt();
                   
            
            int min = Integer.MAX_VALUE;

            for(int x=i;x<=j;x++){
            	if(width[x]<min){
            		min=width[x];
            	}
            }
            out.add(min);
        }
        
        for(int o :out){
        	System.out.println(o);
        }
        
        in.close();
    }
}
