package hackerrank.challenges.the_grid_search;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/the-grid-search
 * 
 * @author bxj62
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		List<String> out = new ArrayList<String>();

		for (int a0 = 0; a0 < t; a0++) {
			int R = in.nextInt();
			//int C = in.nextInt();
			String G[] = new String[R];
			for (int G_i = 0; G_i < R; G_i++) {
				G[G_i] = in.next();
			}
			int r = in.nextInt();
			int c = in.nextInt();
			String P[] = new String[r];
			for (int P_i = 0; P_i < r; P_i++) {
				P[P_i] = in.next();
			}

			boolean found = false;
			inner:
			for (int i = 0; i < R; i++) {

				int x = 0;			
				while (G[i].substring(x).indexOf(P[0]) > -1) {
					if (i + r <= R) {
						found = searchSubMatrix(G, x, P, i, R, r, c);
						if (found) {
							break inner;
						}
					}
					
					if(G[i].substring(x+1).indexOf(P[0])>-1){
						x+=G[i].substring(x+1).indexOf(P[0])+1;
					}else{
						x=G[i].length()-1;
					}
					
				}
			}
			out.add(found ? "YES" : "NO");

		}

		for (String o : out) {
			System.out.println(o);
		}

		in.close();
	}

	public static boolean searchSubMatrix(String G[], int x, String P[], int i, int R, int r, int c) {
		int search = 0;
		int xindex = G[i].substring(x).indexOf(P[0]);
		int I = i + r;

		for (; i < I; i++) {
			if (G[i].substring(x).indexOf(P[search++]) != xindex) {
				return false;
			}
		}
		return true;
	}

}
