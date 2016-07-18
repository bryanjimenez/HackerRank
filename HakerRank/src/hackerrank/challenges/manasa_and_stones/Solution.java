package hackerrank.challenges.manasa_and_stones;

import java.util.*;
/**
 * https://www.hackerrank.com/challenges/manasa-and-stones
 * @author bxj62
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = Integer.parseInt(in.nextLine().trim());

		while (t-- > 0) {

			int n = Integer.parseInt(in.nextLine().trim());
			int a = Integer.parseInt(in.nextLine().trim());
			int b = Integer.parseInt(in.nextLine().trim());

			Set<Integer> mySet = new TreeSet<Integer>();
			mySet.add(0);
			
			while (n-->1) {
				Set<Integer> newSet = new TreeSet<Integer>();

				for(int x:mySet){
					newSet.add(x+a);
					newSet.add(x+b);
				}

				mySet = newSet;
			}
			printSet(mySet);

		}

		in.close();
	}
	
	public static void printSet(Set<Integer> s){
		for(int x:s){
			System.out.print(x+" ");
		}
		System.out.println();
	}
}