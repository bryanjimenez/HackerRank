package hackerrank.challenges.mini_max_sum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        
        List<Long> sums = new ArrayList<Long>();
        sums.add(a+b+c+d);
        sums.add(a+b+c+e);
        sums.add(a+b+d+e);
        sums.add(a+c+d+e);
        sums.add(b+c+d+e);
 

        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        
        for(int i=0;i<sums.size();i++){
        	if(sums.get(i)>max){
        		max=sums.get(i);
        	}
        	if(sums.get(i)<min){
        		min=sums.get(i);
        	}
        }
        
        System.out.println(min+" "+max);
        
        
    }
}