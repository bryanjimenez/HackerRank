package hackerrank.challenges.library_fine;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/library-fine
 * @author bxj62
 *
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        
        int fee =0;
        
        if(y1>y2){
        	fee= 10000;
        	// year fee
        }else if(m1>m2 && y1==y2){
        	fee = (m1-m2)*500;
        	// month fee
        }else if(d1>d2 && m1==m2 && y1==y2){
        	//day fee
        	fee = (d1-d2)*15;
        }
        
        System.out.println(fee);
        
        in.close();
    }
}
