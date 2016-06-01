package hackerrank.challenges.quicksort2;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/quicksort2
 * @author bxj62
 *
 */
public class Solution {

	static void quickSort(int[] ar) {

		partition(ar);
	}

	static int[] partition(int[] ar) {
		if (ar.length > 1) {
			int p = ar[0];
			List<Integer> left = new ArrayList<Integer>();
			List<Integer> right = new ArrayList<Integer>();

			for (int i = 1; i < ar.length; i++) {
				if (ar[i] < p) {
					left.add(ar[i]);
				} else {
					right.add(ar[i]);
				}
			}

			return joinArray(partition(toArray(left)), ar[0], partition(toArray(right)));
			
		} else if (ar.length == 1) {
			return ar;
		} else {
			return null;
		}

	}

	public static int[] joinArray(int[] left, int p, int[] right) {
		List<Integer> answer = new ArrayList<Integer>();
		if(left!=null)
		for (int l : left) {
			answer.add(l);
		}
		answer.add(p);
		if(right!=null)
		for (int r : right) {
			answer.add(r);
		}
		
		printArray(toArray(answer));
		
		return toArray(answer);
	}

	public static int[] toArray(List<Integer> list) {
		int[] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
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
		quickSort(ar);
		in.close();
	}
}
