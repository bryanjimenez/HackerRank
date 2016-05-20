package hackerrank.challenges.time_conversion;

import java.util.Scanner;
/**
 * https://www.hackerrank.com/challenges/time-conversion
 * @author bxj62
 *
 */
public class Solution {

	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String[] p = time.split(":");
        
        int hr=Integer.parseInt(p[0]);
        
        if(time.endsWith("PM")){
        	if(hr<12){
        		hr+=12;
        	}
        }else{
        	if(hr==12){
        		hr=0;
        	}
        }
        
        System.out.println(String.format("%02d", hr)+":"+p[1]+":"+p[2].substring(0, 2));
        in.close();
    }
}
