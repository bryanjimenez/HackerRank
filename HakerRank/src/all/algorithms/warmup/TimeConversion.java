package all.algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {

	
    public static void main(String[] args) {
        Scanner in = new Scanner("12:00:00AM");
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
    }
}
