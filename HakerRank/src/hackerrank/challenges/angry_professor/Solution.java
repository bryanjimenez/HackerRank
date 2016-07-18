package hackerrank.challenges.angry_professor;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/angry-professor
 * @author bxj62
 *
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        List<String> output = new ArrayList<String>();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            
            int early=0;
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                if(a[a_i]<=0){
                	early++;
                }
            }

            if(early<k){
            	output.add("YES");
            }else{
            	output.add("NO");
            }
        }
        
        for(String o :output){
        	System.out.println(o);
        }
        in.close();
    }
}
