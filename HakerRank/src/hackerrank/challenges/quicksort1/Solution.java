package hackerrank.challenges.quicksort1;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/quicksort1
 * @author bxj62
 *
 */
public class Solution {

	static void partition(int[] ar) {
		int p = ar[0];
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
			
		for(int i=1;i<ar.length;i++){
			if(ar[i]<p){
				left.add(ar[i]);
			}else{
				right.add(ar[i]);
			}
		}
		
		left.add(p);
		left.addAll(right);

		for (int n : left) {
			System.out.print(n + " ");
		}
	}

	static void printArray(Integer[] answer) {
		for (int n : answer) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		partition(ar);
		in.close();
	}
}
