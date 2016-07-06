package hackerrank.contests.w21.challenegs.luck_balance;

import java.util.*;
import java.util.List;


public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        List<Integer> contests = new ArrayList<Integer>();
        in.nextLine();
        int balance =0;
        while(n-->0){
            int luck = in.nextInt();
            int important = in.nextInt();
            if(important ==1){
                contests.add(luck);
            }else{
                balance+=luck;
            }
        }
        
        Collections.sort(contests);
        
        
        for(int i=0;i<k;i++){
            balance+=contests.get(contests.size()-1-i);
            //contests.remove(contests.size()-1-i);
        }
        
        for(int i=0;i<contests.size()-k;i++){
            balance-=contests.get(i);
        }
        
        
        
        System.out.println(balance);
            
        in.close();
    }
}