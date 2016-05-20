package hackerrank.challenges.diagonal_difference;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference
 * @author bxj62
 *
 */
public class Solution {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int diag1 = 0;
        int diag2 = 0;
        
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                
                if(a_i==a_j){
                    diag1+=a[a_i][a_j];
                }
                if(a_i+a_j==n-1){
                    diag2+=a[a_i][a_j];
                }
            }
        }
        System.out.println(Math.abs(diag1-diag2));
        in.close();
    }
}
