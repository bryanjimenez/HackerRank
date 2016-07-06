package hackerrank.challenges.two_arrays;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/two-arrays/
 * @author bxj62
 *
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t = Integer.parseInt(in.nextLine());
        
        
        while(t-->0){
            int n = in.nextInt();
            int k = in.nextInt();
            in.nextLine();
            
            int[] a = new int[n];
            int[] b = new int[n];
            
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]=in.nextInt();
            }
            
            Arrays.sort(a);
            
            Arrays.sort(b);
            
            boolean complies = true;
            for(int i=0;i<n;i++){
                if(a[i]+b[n-i-1]<k){
                    complies=false;
                    break;
                }
            }
            System.out.println(complies?"YES":"NO");
            
        }
        in.close();
    }
}