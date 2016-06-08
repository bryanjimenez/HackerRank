package hackerrank.challenges.quicksort3;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/quicksort3
 * 
 * @author bxj62
 *
 */
public class Solution {
	
	
	public static void quickSort(int[] ar, int start, int end){
			
		int p = end;
		int j =start;
		
		for(int i=start;i<end+1;i++){
			if(ar[i]>ar[p]){
				//fine
			}else{
				int tmp = ar[j];
				ar[j]=ar[i];
				ar[i]=tmp;
				j++;
			}
		}
		
		printArray(ar);
		
		if(start<j-2)
			quickSort(ar,start, j-2);
		
		if(j<end)
			quickSort(ar,j,end);
		
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
		
		for(int i=0;i<n;i++){
			ar[i]=in.nextInt();
		}
		
		
		quickSort(ar, 0, ar.length-1);
		in.close();
	}
}