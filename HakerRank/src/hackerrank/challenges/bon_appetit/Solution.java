package hackerrank.challenges.bon_appetit;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int n = in.nextInt();
    	int x = in.nextInt();
    	
    	int bill = 0;
    	while(n-->0){
    		int t =in.nextInt();
    		if(x--!=0){
    			bill+=t;
    		}

    	}
    	
    	int charged = in.nextInt();
    	
    	bill= bill/2;


    	
    	if(charged>bill){
    		System.out.println((charged-bill));
    	}else{
    		System.out.println("Bon Appetit");
    	}

    	in.close();
    }
}