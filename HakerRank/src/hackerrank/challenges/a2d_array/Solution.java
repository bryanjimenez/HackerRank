package hackerrank.challenges.a2d_array;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/2d-array
 * @author bryan
 *
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
      
        int maxSum=Integer.MIN_VALUE;
        int a,b,c,d,e,f,g;
        
        
        for(int arr_i=1; arr_i < 5; arr_i++){
            for(int arr_j=1; arr_j < 5; arr_j++){
                a = arr[arr_i-1][arr_j-1];
                b = arr[arr_i-1][arr_j];
                c = arr[arr_i-1][arr_j+1];
                
                d = arr[arr_i][arr_j];
                
                e = arr[arr_i+1][arr_j-1];
                f = arr[arr_i+1][arr_j];
                g = arr[arr_i+1][arr_j+1];
                
                maxSum = Math.max(maxSum, a+b+c+d+e+f+g);
            }
        }
        
        System.out.println(maxSum);
        
        in.close();
    }
}
