package hackerrank.challenges.equal_stacks;

import java.io.*;
import java.util.*;
/**
 * https://www.hackerrank.com/challenges/equal-stacks
 * @author bxj62
 *
 */
public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();

		int h1sum = 0;
		int h2sum = 0;
		int h3sum = 0;

		int h1[] = new int[n1];
		for (int h1_i = 0; h1_i < n1; h1_i++) {
			h1[h1_i] = in.nextInt();
			h1sum += h1[h1_i];
		}
		int h2[] = new int[n2];
		for (int h2_i = 0; h2_i < n2; h2_i++) {
			h2[h2_i] = in.nextInt();
			h2sum += h2[h2_i];
		}
		int h3[] = new int[n3];
		for (int h3_i = 0; h3_i < n3; h3_i++) {
			h3[h3_i] = in.nextInt();
			h3sum += h3[h3_i];
		}

		int h1_i = 0;
		int h2_i = 0;
		int h3_i = 0;

		//System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("C:\\Users\\bxj62\\Desktop\\console.out")), true));

		//System.out.println("start");

		while (!(h1sum == h2sum && h1sum == h3sum)) {
			//System.out.println(h1sum +" "+ h2sum +" "+ h3sum+" "+((h1sum != h2sum)?"true":"false") +" "+ ((h1sum != h3sum)?"true":"false"));

			if (h1sum > h2sum && h1sum > h3sum) {
				h1sum -= h1[h1_i];
				h1_i++;
			} else if (h2sum > h1sum && h2sum > h3sum) {
				h2sum -= h2[h2_i];
				h2_i++;
			} else if (h3sum > h1sum && h3sum > h2sum) {
				h3sum -= h3[h3_i];
				h3_i++;
			} else {
				// there is a tie
				//System.out.println(h1sum + " " + h2sum + " " + h3sum + " " + ((h1sum != h2sum) ? "true" : "false") + " "+ ((h1sum != h3sum) ? "true" : "false"));

				if (h1sum == h2sum) {
					h1sum -= h1[h1_i];
					h1_i++;
					
					h2sum -= h2[h2_i];
					h2_i++;
				} else if (h1sum == h3sum) {
					h1sum -= h1[h1_i];
					h1_i++;

					h3sum -= h3[h3_i];
					h3_i++;
				} else /* if(h2sum==h3sum) */ {
					h2sum -= h2[h2_i];
					h2_i++;

					h3sum -= h3[h3_i];
					h3_i++;
				}
			}
		}

		//System.out.println(h1sum + " " + h2sum + " " + h3sum + " " + ((h1sum != h2sum) ? "true" : "false") + " "+ ((h1sum != h3sum) ? "true" : "false"));

		//System.out.println("end");
		//System.out.flush();

		System.out.println(h1sum);
		in.close();
	}
}
