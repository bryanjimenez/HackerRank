package hackerrank.challenges.maximizing_xor;

import java.util.*;

public class Solution {
    static int maxXor(int l, int r) {

    	int max = 0;
    	for(int a=l;a<r;a++){
    		for(int b=a+1;b<r+1;b++){
				if((a^b)>max){
    				max=a^b;
    				//System.out.println(max);
				}
    		}
    	}

    	return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        in.close();
    }
}
