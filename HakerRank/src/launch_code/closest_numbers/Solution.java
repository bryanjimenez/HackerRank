package launch_code.closest_numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/**
 * Closest Numbers launchcode
 * @author bryan
 *
 */
public class Solution {

	static void closestNumbers(int[] numbers) {
		Set<String> myset = new TreeSet<String>();

		List<Integer> myList =new ArrayList<Integer>();

		
		int minDiff=Integer.MAX_VALUE;

		for(int i:numbers){
			for(int j:numbers){
				int min = Math.min(i, j);
				int max = Math.max(i, j);
				
				if(Math.abs(min-max)<minDiff && Math.abs(min-max)>0){
					minDiff=Math.abs(min-max);
				}
				
			}
		}
	
		

		for(int i:numbers){
			for(int j:numbers){
				int min = Math.min(i, j);
				int max = Math.max(i, j);
				
				if(  Math.abs(min-max)==minDiff){
					myset.add(min+" "+max);
					if(!myList.contains(min)){
						myList.add(min);
					}
				}				
			}
		}
		
//		for (String s : myset) {
//		    System.out.println(s);
//		}
		
		Collections.sort(myList);
		
		for(int i:myList){
			System.out.println(i+" "+(i+minDiff));
		}
		
		
    }
	
	
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int _numbers_size = 0;
        _numbers_size = Integer.parseInt(in.nextLine().trim());
        int[] _numbers = new int[_numbers_size];
        int _numbers_item;
        for(int _numbers_i = 0; _numbers_i < _numbers_size; _numbers_i++) {
            _numbers_item = Integer.parseInt(in.nextLine().trim());
            _numbers[_numbers_i] = _numbers_item;
        }
        
        
        closestNumbers(_numbers);
        
        in.close();
    }
}
