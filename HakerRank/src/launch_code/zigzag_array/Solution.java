package launch_code.zigzag_array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Zigzag Array
 * 
 * @author bryan
 *
 */
public class Solution {

	static int[] wiggleArrangeArray(int[] intArr) {
		List<Integer> a = new ArrayList<Integer>();
		int[] result = new int[intArr.length];

		for (int i : intArr) {
			a.add(i);
		}

		Collections.sort(a);
		
//		for (int i : a) {
//			System.out.print(i + " ");
//		}
//		System.out.println();

		int count = 0;
		for(int i=0;i<a.size()/2;i++){
			System.out.print(a.get(a.size()-i-1)+" "+a.get(i)+" ");
			result[count++]=a.get(a.size()-i-1);
			result[count++]=a.get(i);
		}
		if(a.size()%2!=0){
			System.out.print(a.get(a.size()/2));
			result[count]=a.get(a.size()/2);
		}
		
		
		System.out.println();
		

		return result;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int _numbers_size = 0;
		_numbers_size = Integer.parseInt(in.nextLine().trim());
		int[] _numbers = new int[_numbers_size];
		int _numbers_item;
		for (int _numbers_i = 0; _numbers_i < _numbers_size; _numbers_i++) {
			_numbers_item = Integer.parseInt(in.nextLine().trim());
			_numbers[_numbers_i] = _numbers_item;
		}

		int[] res = wiggleArrangeArray(_numbers);

	}

}
