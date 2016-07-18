package hackerrank.challenges.utopian_tree;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/utopian-tree
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
            int cycle=0;
            int height=1;
            for(int i=0;i<n;i++){
            	if(cycle%2==0){
            		height*=2;
            	}else{
            		height+=1;
            	}
            	cycle++;
            }
            out.add(height);
        }
        for(Integer o :out){
        	System.out.println(o);
        }
        in.close();
    }
}
